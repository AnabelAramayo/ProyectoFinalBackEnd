package com.example.ProyectoFinal.services;

import com.example.ProyectoFinal.models.Odontologo;
import com.example.ProyectoFinal.models.OdontologoDTO;
import com.example.ProyectoFinal.models.Paciente;
import com.example.ProyectoFinal.models.PacienteDTO;
import com.example.ProyectoFinal.repository.IOdontologoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class OdontologoService implements IOdontologoService {

    @Autowired
    private IOdontologoRepository odontologoRepository;

    @Autowired
    ObjectMapper mapper;

    //REUTILIZABLE
    private void guardarOdontologo(OdontologoDTO odontologoDTO) {
        Odontologo odontologo1 = mapper.convertValue(odontologoDTO, Odontologo.class);
        odontologoRepository.save(odontologo1);
    }

    @Override
    public void agregarOdontologo(OdontologoDTO odontologoDTO) {
        //guardar un odontologo en la base de datos
        //el DTO me ayuda a mover datos entre componentes
        guardarOdontologo(odontologoDTO);
    }

    @Override
    public void eliminarOdontologo(Integer id) {
        odontologoRepository.deleteById(id);
    }

    @Override
    public void modificarOdontologo(OdontologoDTO odontologoDTO) {
        guardarOdontologo(odontologoDTO);
    }

    @Override
    public OdontologoDTO buscarOdontologo(Integer id) {
        Optional<Odontologo> odontologo = odontologoRepository.findById(id);
        OdontologoDTO odontologoDTO = null;
        if(odontologo.isPresent())
            odontologoDTO = mapper.convertValue(odontologo, OdontologoDTO.class);
        return odontologoDTO;
    }

    @Override
    public Set<OdontologoDTO> listarOdontologos() {

        List<Odontologo> odontologosList = odontologoRepository.findAll();
        Set<OdontologoDTO> odontologosDTO = new HashSet<>();

        for (Odontologo odontologo:odontologosList){
            odontologosDTO.add(mapper.convertValue(odontologo, OdontologoDTO.class));
        }

        return odontologosDTO;
    }
}
