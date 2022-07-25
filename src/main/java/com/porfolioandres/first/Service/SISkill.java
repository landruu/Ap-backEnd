package com.porfolioandres.first.Service;

import com.porfolioandres.first.Model.SKill;
import java.util.List;


public interface SISkill {
    // Esta interface se implementa en la Class Service de este modulo.
    
    public List<SKill> verSkill();
    
    public void agregarSkill(SKill Skill);
    
    public void borrarSkill(Long id);
    
    public SKill buscarSkill(Long id);
    
}
