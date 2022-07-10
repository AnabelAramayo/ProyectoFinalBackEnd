package com.example.ProyectoFinal.repository;

import com.example.ProyectoFinal.models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.naming.InterruptedNamingException;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Integer> {
}
