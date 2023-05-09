package com.example.projectt.Repos;

import com.example.projectt.Entidad.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepo extends  JpaRepository<Alumno, Long> {
}
