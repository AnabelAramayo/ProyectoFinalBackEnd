package com.example.ProyectoFinal.services;

import com.example.ProyectoFinal.models.Turno;
import com.example.ProyectoFinal.models.TurnoDTO;
import com.example.ProyectoFinal.repository.ITurnoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class TurnoService implements ITurnoService{

    @Autowired
    private ITurnoRepository turnoRepository;

    @Autowired
    ObjectMapper mapper;

    //REUTILIZABLE
    private void guardarTurno (TurnoDTO turnoDTO) {
        Turno turno1 = mapper.convertValue(turnoDTO, Turno.class);
        turnoRepository.save(turno1);
    }

    @Override
    public void registrarTurno(TurnoDTO turnoDTO) {guardarTurno(turnoDTO);}

    @Override
    public void eliminarTurno(Integer id) {
        turnoRepository.deleteById(id);
    }

    @Override
    public void modificarTurno(TurnoDTO turnoDTO) {
        guardarTurno(turnoDTO);
    }

    @Override
    public TurnoDTO buscarTurno(Integer id) {
        Optional<Turno> turno = turnoRepository.findById(id);
        TurnoDTO turnoDTO = null;
        if(turno.isPresent())
            turnoDTO = mapper.convertValue(turno, TurnoDTO.class);
        return turnoDTO;
    }

    @Override
    public Set<TurnoDTO> listarTurnos() {
        List<Turno> turnosList = turnoRepository.findAll();
        Set<TurnoDTO> turnosDTO = new HashSet<>();

        for (Turno turno:turnosList){
            turnosDTO.add(mapper.convertValue(turno, TurnoDTO.class));
        }

        return turnosDTO;
    }
}
