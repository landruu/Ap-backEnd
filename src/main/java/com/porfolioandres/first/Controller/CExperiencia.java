package com.porfolioandres.first.Controller;

import com.porfolioandres.first.Model.Experiencia;
import com.porfolioandres.first.Service.SCExperiencia;
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
@RequestMapping("exp")
//@CrossOrigin(origins = "http://localhost:4200")
public class CExperiencia {
    // La controladora debe estar conectada al "Servicio"
    
    @Autowired
    private SCExperiencia expServ;
    
    //crear
    @PostMapping ("/crear")
    public void agregarExp(@RequestBody Experiencia expe) {
        expServ.agregarExp(expe);   
    }
    
    // ver listado
    @GetMapping ("/ver")
    @ResponseBody
    public List<Experiencia> verExp(){
        return expServ.verExp();
    }
    
    // Borrar Experiencia
    @DeleteMapping ("/borrar/{id}")
    public void borrarExp(@PathVariable Long id){
        expServ.borrarExp(id);
    }
    
    // detail
    @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia> detail(@PathVariable Long id){
        return new ResponseEntity<>(expServ.buscarExp(id), HttpStatus.OK);
    }

    // El bendito Edit
    @PutMapping("/editar/{id}")
    public void editExp(@PathVariable("id") Long id, @RequestBody Experiencia newExp){
    
    Experiencia expEdit = expServ.buscarExp(id);
    
    expEdit.setNombre(newExp.getNombre());
    expEdit.setLogo(newExp.getLogo());
    expEdit.setDescripcion(newExp.getDescripcion());
    expEdit.setAlta(newExp.getAlta());
    expEdit.setBaja(newExp.getBaja());
    expServ.agregarExp(expEdit);
    }
}
