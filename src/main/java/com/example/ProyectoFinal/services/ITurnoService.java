package com.example.ProyectoFinal.services;

import com.example.ProyectoFinal.models.Turno;
import com.example.ProyectoFinal.models.TurnoDTO;

import java.util.Set;

public interface ITurnoService {

    //registrar, eliminar, modificar, buscar y listar


    void registrarTurno(TurnoDTO turnoDTO);
    void eliminarTurno(Integer id);
    void modificarTurno(TurnoDTO turnoDTO);
    TurnoDTO buscarTurno(Integer id);
    Set<TurnoDTO> listarTurnos();
}
