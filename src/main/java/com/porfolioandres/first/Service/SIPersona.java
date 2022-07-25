package com.porfolioandres.first.Service;

import com.porfolioandres.first.Model.Persona;
import java.util.List;

public interface SIPersona {
    // Esta interface se implementa en la Class Service de este modulo.
    
    public List<Persona> verPers();
    
    public void agregarPers(Persona pers);
    
    public void borrarPers(Long id);
    
    public Persona buscarPers(Long id);
}
