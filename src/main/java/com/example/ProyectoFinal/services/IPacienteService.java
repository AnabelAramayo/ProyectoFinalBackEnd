package com.example.ProyectoFinal.services;

import com.example.ProyectoFinal.models.OdontologoDTO;
import com.example.ProyectoFinal.models.PacienteDTO;
import com.example.ProyectoFinal.models.TurnoDTO;

import java.util.Set;

public interface IPacienteService {

    //listar, agregar, modificar y eliminar

    void agregarPaciente (PacienteDTO pacienteDTO);
    void eliminarPaciente (Integer id);
    void modificarPaciente(PacienteDTO pacienteDTO);
    Set<PacienteDTO> listarPacientes();
    PacienteDTO buscarPaciente (Integer id);
}
