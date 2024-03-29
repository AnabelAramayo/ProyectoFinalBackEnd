package com.example.ProyectoFinal.controllers;

import com.example.ProyectoFinal.models.Turno;
import com.example.ProyectoFinal.models.TurnoDTO;
import com.example.ProyectoFinal.services.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    @Autowired
    ITurnoService turnoService;

    @PostMapping
    public ResponseEntity<?> agregarTurno(@RequestBody TurnoDTO turnoDTO){
        turnoService.registrarTurno(turnoDTO);
       return ResponseEntity.ok(HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public TurnoDTO getTurno(@PathVariable Integer id){
        return turnoService.buscarTurno(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarTurno(@RequestBody TurnoDTO turnoDTO){
        turnoService.modificarTurno(turnoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarTurno(@PathVariable Integer id){
        turnoService.eliminarTurno(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<TurnoDTO> getTodosTurnos(){
        return turnoService.listarTurnos();
    }
}
