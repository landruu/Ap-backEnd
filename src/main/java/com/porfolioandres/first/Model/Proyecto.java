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
@Table(name="Proyectos")
@Getter @Setter
public class Proyecto {
    // Mapeo de hacia la base de datos MySQL
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Id
    private Long id;
    private String nombre;
    private String iniciado;
    private String descripcion;
    private URL link; // Recibe una URL;
    
    //Constructores
    public Proyecto() {
    }
    
    public Proyecto(Long id, String nombre, String iniciado, String descripcion, URL link) {
        this.id = id;
        this.nombre = nombre;
        this.iniciado = iniciado;
        this.descripcion = descripcion;
        this.link = link;
    }
    
}
