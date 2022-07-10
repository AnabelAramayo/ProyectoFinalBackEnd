package com.example.ProyectoFinal.controllers;

import com.example.ProyectoFinal.models.Odontologo;
import com.example.ProyectoFinal.models.OdontologoDTO;
import com.example.ProyectoFinal.services.IOdontologoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {

    @Autowired
    IOdontologoService odontologoService;

    @PostMapping
    public ResponseEntity<?> agregarOdontologo(@RequestBody OdontologoDTO odontologoDTO){
        odontologoService.agregarOdontologo(odontologoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public OdontologoDTO getOdontologo(@PathVariable Integer id){
        return odontologoService.buscarOdontologo(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarOdontologo(@RequestBody OdontologoDTO odontologoDTO){
        odontologoService.modificarOdontologo(odontologoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarOdontologo(@PathVariable Integer id){
        odontologoService.eliminarOdontologo(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<OdontologoDTO> getTodosOdontologos(){
        return odontologoService.listarOdontologos();
    }

}
