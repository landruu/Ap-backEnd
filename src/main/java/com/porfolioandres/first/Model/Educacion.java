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
@Table(name="Educaciones")
@Getter @Setter
public class Educacion {
    // Mapeo de hacia la base de datos MySQL
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Id
    private Long id;
    private String institucion;
    private URL logo;
    private String descripcion;
    private Boolean completo; // Recibe true, false o null
    private String duracion; //Hace referencia al tiempo que duró el estudio
    
    //Constructores

    public Educacion() {
    }

    public Educacion(Long id, String institucion, URL logo, String descripcion, Boolean completo, String duracion) {
        this.id = id;
        this.institucion = institucion;
        this.logo = logo;
        this.descripcion = descripcion;
        this.completo = completo;
        this.duracion = duracion;
    }  
}
