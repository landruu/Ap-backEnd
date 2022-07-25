package com.porfolioandres.first.Service;

// Sin anotations

import com.porfolioandres.first.Model.Proyecto;
import java.util.List;

public interface SIProyecto {
    // Esta interface se implementa en la Class Service de este modulo.
    
    public List<Proyecto> verProject();
    
    public void agregarProject(Proyecto pers);
    
    public void borrarProject(Long id);
    
    public Proyecto buscarProject(Long id);
}
