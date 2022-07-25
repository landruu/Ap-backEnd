package com.porfolioandres.first.Service;

import com.porfolioandres.first.Model.Educacion;
import com.porfolioandres.first.Repository.REducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SCEducacion implements SIEducacion {
    // Esta class se extiende del mismo PAQUETE SERVICE interface.
    // Lógíca de negocio operaciones sobre los datos.
    
    //INYECTAR REPOSITORIO
    @Autowired
    public REducacion eduRepo;

    @Override
    public List<Educacion> verEdu() {
        return eduRepo.findAll();
    }

    @Override
    public void agregarEdu(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void borrarEdu(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEdu(Long id) {
        return eduRepo.findById(id).orElse(null);
    }
}
