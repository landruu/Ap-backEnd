package com.porfolioandres.first.Model;

import java.net.URL;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@Table (name = "experiencias")
@Getter @Setter
public class Experiencia {
    // Mapeo de hacia la base de datos MySQL
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Id
    private Long id;
    private String nombre;
    private URL logo;
    private String descripcion;
    private String alta;
    private String baja;
    
    //Constructores
    public Experiencia() {
    }

    public Experiencia(Long id, String nombre, URL logo, String descripcion, String alta, String baja) {
        this.id = id;
        this.nombre = nombre;
        this.logo = logo;
        this.descripcion = descripcion;
        this.alta = alta;
        this.baja = baja;
    }
}
