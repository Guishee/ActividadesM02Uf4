package com.example.projectt.Repos;

import com.example.projectt.Entidad.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepo extends JpaRepository<Proyecto, Long> {
    //public Proyecto save(Proyecto p);
}
