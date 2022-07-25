package com.porfolioandres.first.Controller;

import com.porfolioandres.first.Model.SKill;
import com.porfolioandres.first.Service.SCSkill;
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
@RequestMapping("skill")
@CrossOrigin(origins = "http://localhost:4200")
public class CSkill {
    // La controladora se conecta al "Servicio"
    
    // Inyecto Class Service de manera privada
    @Autowired
    private SCSkill skillServ;
    
    //crear
    @PostMapping ("/crear")
    public void agregarSkill(@RequestBody SKill skill) {
        skillServ.agregarSkill(skill);
    }
    
    // ver listado
    @GetMapping ("/ver")
    @ResponseBody
    public List<SKill> verSkill(){
        return skillServ.verSkill();
    }
    
    // Borrar Experiencia
    @DeleteMapping ("/borrar/{id}")
    public void borrarEdu(@PathVariable Long id){
        skillServ.borrarSkill(id);
    }
    
    // detail
    @GetMapping("/detail/{id}")
    public ResponseEntity<SKill> detail(@PathVariable Long id){
        return new ResponseEntity<>(skillServ.buscarSkill(id), HttpStatus.OK);
    }

    // El bendito Edit
    @PutMapping("/editar/{id}")
    public void editEdu(@PathVariable("id") Long id, @RequestBody SKill newSkill){
    
    SKill skillEdit = skillServ.buscarSkill(id);
    skillEdit.setNombre(newSkill.getNombre());
    skillEdit.setDescripcion(newSkill.getDescripcion());
    skillEdit.setAvance(newSkill.getAvance());
    
    skillServ.agregarSkill(skillEdit);
    }
}
