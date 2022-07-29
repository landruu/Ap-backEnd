package com.porfolioandres.first.Controller;

import com.porfolioandres.first.Model.Educacion;
import com.porfolioandres.first.Service.SCEducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("edu")
//@CrossOrigin(origins = "http://localhost:4200")
public class CEducacion {
    // La controladora se conecta al "Servicio"
    
    // Inyecto Class Service de manera privada
    @Autowired
    private SCEducacion eduServ;
    
    //crear
    @PostMapping ("/crear")
    public void agregarEdu(@RequestBody Educacion Edu) {
        eduServ.agregarEdu(Edu); 
    }
    
    // ver listado
    @GetMapping ("/ver")
    @ResponseBody
    public List<Educacion> verEdu(){
        return eduServ.verEdu();
    }
    
    // Borrar Experiencia
    @DeleteMapping ("/borrar/{id}")
    public void borrarEdu(@PathVariable Long id){
        eduServ.borrarEdu(id);
    }
    
    // detail
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> detail(@PathVariable Long id){
        return new ResponseEntity<>(eduServ.buscarEdu(id), HttpStatus.OK);
    }

    // El bendito Edit
    @PutMapping("/editar/{id}")
    public void editEdu(@PathVariable("id") Long id, @RequestBody Educacion newEdu){
    
    Educacion eduEdit = eduServ.buscarEdu(id);
    eduEdit.setInstitucion(newEdu.getInstitucion());
    eduEdit.setLogo(newEdu.getLogo());
    eduEdit.setDescripcion(newEdu.getDescripcion());
    eduEdit.setCompleto(newEdu.getCompleto());
    eduEdit.setDuracion(newEdu.getDuracion());
  
    eduServ.agregarEdu(eduEdit);
    }
}
