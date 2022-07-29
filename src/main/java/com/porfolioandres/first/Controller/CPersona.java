package com.porfolioandres.first.Controller;

import com.porfolioandres.first.Model.Persona;
import com.porfolioandres.first.Service.SCPersona;
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
@RequestMapping("usuario")
//@CrossOrigin(origins = "http://localhost:4200")
public class CPersona {
    // La controladora debe estar conectada al "Servicio"
    
    // Inyecto dependencia desde el Servicio donde estan los metodos descriptos: SCPersona
    @Autowired
    private SCPersona perControl;
    
    //crear Personas
    @PostMapping ("/crear")
    public void agregarPers(@RequestBody Persona pers){
        perControl.agregarPers(pers);
    }
    
    //Ver Listado Personas
    @GetMapping ("/ver")
    @ResponseBody
    public List<Persona> verPers(){
        return perControl.verPers();
    }
    
    //Borrar Personas
    @DeleteMapping("/borrar/{id}")
    public void borrarPers(@PathVariable Long id) {
        perControl.borrarPers(id);
    }
    
        // detail
    @GetMapping("/detail/{id}")
    public ResponseEntity<Persona> detail(@PathVariable Long id){
        return new ResponseEntity<>(perControl.buscarPers(id), HttpStatus.OK);
    }
    
    //Editar Personas
    @PutMapping("/editar/{id}")
    public void editPers(@PathVariable("id") Long id, @RequestBody Persona newPers){
    
    Persona persEdit = perControl.buscarPers(id);
    
    persEdit.setNombre(newPers.getNombre());
    persEdit.setApellido(newPers.getApellido());
    persEdit.setAvatar(newPers.getAvatar());
    persEdit.setDireccion(newPers.getDireccion());
    persEdit.setNacimiento(newPers.getNacimiento());
    persEdit.setAbout(newPers.getAbout());
    persEdit.setOficio(newPers.getOficio());
    
    perControl.agregarPers(persEdit);

    }
    
}
