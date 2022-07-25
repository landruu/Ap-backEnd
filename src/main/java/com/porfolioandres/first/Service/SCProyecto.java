package com.porfolioandres.first.Service;

import com.porfolioandres.first.Model.Proyecto;
import com.porfolioandres.first.Repository.RProyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SCProyecto implements SIProyecto {
    // Esta class se extiende del mismo PAQUETE SERVICE interface.
    // Lógíca de negocio operaciones sobre los datos.
    // El servicio debe estar conectado al repositorio
    
    //Inyecto dependencias desde el repo que tiene los metodos originales
    @Autowired
    public RProyecto proyServ;

    @Override
    public List<Proyecto> verProject() {
        return proyServ.findAll();
    }

    @Override
    public void agregarProject(Proyecto proy) {
        proyServ.save(proy);
    }

    @Override
    public void borrarProject(Long id) {
        proyServ.deleteById(id);
    }

    @Override
    public Proyecto buscarProject(Long id) {
        return proyServ.findById(id).orElse(null);
    }
  
}
