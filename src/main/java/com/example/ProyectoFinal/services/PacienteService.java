package com.example.ProyectoFinal.services;

import com.example.ProyectoFinal.models.Paciente;
import com.example.ProyectoFinal.models.PacienteDTO;
import com.example.ProyectoFinal.repository.IPacienteRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PacienteService implements IPacienteService{

    @Autowired
    private IPacienteRepository pacienteRepository;

    @Autowired
    ObjectMapper mapper;

    //REUTILIZABLE
    private void guardarPaciente (PacienteDTO pacienteDTO) {
        Paciente paciente1 = mapper.convertValue(pacienteDTO, Paciente.class);
        pacienteRepository.save(paciente1);
    }


    @Override
    public void agregarPaciente(PacienteDTO pacienteDTO) {
        guardarPaciente(pacienteDTO);
    }

    @Override
    public void eliminarPaciente(Integer id) {
        pacienteRepository.deleteById(id);
    }

    @Override
    public void modificarPaciente(PacienteDTO pacienteDTO) {
        guardarPaciente(pacienteDTO);
    }

    @Override
    public PacienteDTO buscarPaciente(Integer id) {
        Optional<Paciente> paciente = pacienteRepository.findById(id);
        PacienteDTO pacienteDTO = null;
        if(paciente.isPresent())
            pacienteDTO = mapper.convertValue(paciente, PacienteDTO.class);
        return pacienteDTO;
    }

    @Override
    public Set<PacienteDTO> listarPacientes() {

        List<Paciente> pacientesList = pacienteRepository.findAll();
        Set<PacienteDTO> pacientesDTO = new HashSet<>();

        for (Paciente paciente:pacientesList){
            pacientesDTO.add(mapper.convertValue(paciente, PacienteDTO.class));
        }

        return pacientesDTO;
    }

}
