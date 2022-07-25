package com.porfolioandres.first.Controller;

import com.porfolioandres.first.Model.Experiencia;
import com.porfolioandres.first.Model.Proyecto;
import com.porfolioandres.first.Service.SCProyecto;
import java.net.URL;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("project")
@CrossOrigin(origins = "http://localhost:4200")
public class CProyecto {
    // La controladora se conecta al "Servicio"
    
    // Inyecto Class Service de manera privada
    @Autowired
    private SCProyecto proyServ;
    
    //crear
    @PostMapping ("/crear")
    public void agregarProy(@RequestBody Proyecto Proy) {
        proyServ.agregarProject(Proy);
    }
    
    // ver listado
    @GetMapping ("/ver")
    @ResponseBody
    public List<Proyecto> verProy(){
        return proyServ.verProject();
    }
    
    // Borrar Experiencia
    @DeleteMapping ("/borrar/{id}")
    public void borrarProy(@PathVariable Long id){
        proyServ.borrarProject(id);
    }
    
    // detail
    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyecto> detail(@PathVariable Long id){
        return new ResponseEntity<>(proyServ.buscarProject(id) , HttpStatus.OK);
    }

    // El bendito Edit
    @PutMapping("/editar/{id}")
    public void editProy(@PathVariable("id") Long id,@PathVariable Proyecto newProyect){
    
    Proyecto proyEdit = proyServ.buscarProject(id);
    
    proyEdit.setNombre(newProyect.getNombre());
    proyEdit.setIniciado(newProyect.getIniciado());
    proyEdit.setDescripcion(newProyect.getDescripcion());
    proyEdit.setLink(newProyect.getLink());
    
    proyServ.agregarProject(proyEdit);
    }
}
