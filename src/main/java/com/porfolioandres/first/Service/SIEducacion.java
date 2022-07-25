package com.porfolioandres.first.Service;

import com.porfolioandres.first.Model.Educacion;
import java.util.List;

public interface SIEducacion {
    
    public List<Educacion> verEdu();
    
    public void agregarEdu(Educacion edu);
    
    public void borrarEdu(Long id);
    
    public Educacion buscarEdu(Long id);
}
