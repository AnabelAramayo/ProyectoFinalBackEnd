package com.example.ProyectoFinal.controllers;

import com.example.ProyectoFinal.models.PacienteDTO;
import com.example.ProyectoFinal.services.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {


    @Autowired
    IPacienteService pacienteService;

    @PostMapping
    public ResponseEntity<?> agregarPaciente(@RequestBody PacienteDTO pacienteDTO){
        pacienteService.agregarPaciente(pacienteDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public PacienteDTO getPaciente(@PathVariable Integer id){
        return pacienteService.buscarPaciente(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarPaciente(@RequestBody PacienteDTO pacienteDTO){
        pacienteService.modificarPaciente(pacienteDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarPaciente(@PathVariable Integer id){
        pacienteService.eliminarPaciente(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<PacienteDTO> getTodosPacientes(){
        return pacienteService.listarPacientes();
    }
}
