package com.porfolioandres.first.Service;

import com.porfolioandres.first.Model.Experiencia;
import java.util.List;


public interface SExperiencia {
    
    public List<Experiencia> verExp();
    
    public void agregarExp(Experiencia exp);
    
    public void borrarExp(Long id);
    
    public Experiencia buscarExp(Long id);

}
