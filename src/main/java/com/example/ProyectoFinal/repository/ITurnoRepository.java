package com.example.ProyectoFinal.repository;

import com.example.ProyectoFinal.models.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurnoRepository extends JpaRepository<Turno, Integer> {
}
