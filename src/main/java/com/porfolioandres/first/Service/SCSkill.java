package com.porfolioandres.first.Service;

import com.porfolioandres.first.Model.SKill;
import com.porfolioandres.first.Repository.RSkill;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SCSkill implements SISkill {
    // Esta class se extiende del mismo PAQUETE SERVICE interface.
    // Lógíca de negocio operaciones sobre los datos.
    
    //INYECTAR REPOSITORIO
    @Autowired
    public RSkill skillRepo;

    @Override
    public List<SKill> verSkill() {
        return skillRepo.findAll();
    }

    @Override
    public void agregarSkill(SKill Skill) {
        skillRepo.save(Skill);
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public SKill buscarSkill(Long id) {
        return skillRepo.findById(id).orElse(null);
    }
    
    
    
}
