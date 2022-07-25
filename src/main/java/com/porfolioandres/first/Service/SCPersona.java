package com.porfolioandres.first.Service;

import com.porfolioandres.first.Model.Persona;
import com.porfolioandres.first.Repository.RPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SCPersona implements SIPersona {
    // Esta class se extiende del mismo PAQUETE SERVICE interface.
    // Lógíca de negocio operaciones sobre los datos.
    // El servicio debe estar conectado al repositorio
    
    //Inyecto dependencias desde el repo que tiene los metodos originales
    @Autowired
    public RPersona perRepo;
    
    @Override
    public List<Persona> verPers() {
        return perRepo.findAll();
    }

    @Override
    public void agregarPers(Persona pers) {
        perRepo.save(pers);
    }

    @Override
    public void borrarPers(Long id) {
        perRepo.deleteById(id);
    }

    @Override
    public Persona buscarPers(Long id) {
        return perRepo.findById(id).orElse(null);
    }
}
