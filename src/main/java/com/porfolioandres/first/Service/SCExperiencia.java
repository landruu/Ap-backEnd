package com.porfolioandres.first.Service;

import com.porfolioandres.first.Model.Experiencia;
import com.porfolioandres.first.Repository.RExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SCExperiencia implements SExperiencia {
    // Esta class se extiende del mismo PAQUETE SERVICE interface SExperiencia.
    // Lógíca de negocio operaciones sobre los datos.
    // El servicio debe estar conectado al repositorio
    @Autowired
    public RExperiencia expRepo;

    @Override
    public List<Experiencia> verExp() {
        return expRepo.findAll();
    }

    @Override
    public void agregarExp(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void borrarExp(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExp(Long id) {
        return expRepo.findById(id).orElse(null);
    }
   
}
