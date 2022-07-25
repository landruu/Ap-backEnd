package com.porfolioandres.first.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@Table(name="habilidades")
@Getter @Setter
public class SKill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Id
    private Long id;
    private String nombre;
    private String descripcion;
    private Long avance; // Hace referencia al avance en %
    
    // Constructores
    public SKill() {
    }
    public SKill(Long id, String nombre, String descripcion, Long avance) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.avance = avance;
    }
 
}
