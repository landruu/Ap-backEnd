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
@Table (name = "personas")
@Getter @Setter
public class Persona {
    // Mapeo de hacia la base de datos MySQL
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Id
    private Long id;
    private String nombre;
    private String apellido;
    private URL avatar;
    private String direccion;
    private String nacimiento;
    private String about;
    private String oficio;
    
    //Constructores
    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, URL avatar, String direccion, String nacimiento, String about, String oficio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.avatar = avatar;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
        this.about = about;
        this.oficio = oficio;
    }     
}
