package com.example.ProyectoFinal.services;

import com.example.ProyectoFinal.models.Odontologo;
import com.example.ProyectoFinal.models.OdontologoDTO;
import com.example.ProyectoFinal.models.TurnoDTO;

import java.util.List;
import java.util.Set;

public interface IOdontologoService {

    //listar, agregar, modificar y eliminar

    void agregarOdontologo(OdontologoDTO odontologoDTO);
    void eliminarOdontologo (Integer id);
    void modificarOdontologo(OdontologoDTO odontologoDTO);
    Set<OdontologoDTO> listarOdontologos();
    OdontologoDTO buscarOdontologo (Integer id);

}
