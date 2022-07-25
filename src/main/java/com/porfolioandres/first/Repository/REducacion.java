package com.porfolioandres.first.Repository;

import com.porfolioandres.first.Model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion, Long> {
    // El respositorio contiene a todos los metodos save, delete, etc...
    // Le pasamos el modelo y el tipo de dato ID

}
