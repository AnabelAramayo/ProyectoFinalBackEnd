package com.example.ProyectoFinal.repository;

import com.example.ProyectoFinal.models.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOdontologoRepository extends JpaRepository<Odontologo, Integer> {
}
