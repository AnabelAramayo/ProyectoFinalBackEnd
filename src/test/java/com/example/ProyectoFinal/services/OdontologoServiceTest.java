package com.example.ProyectoFinal.services;

import com.example.ProyectoFinal.models.OdontologoDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OdontologoServiceTest {

    @Autowired
    private IOdontologoService odontologoService;

    @Test
    public void testCrearOdontologo(){

        //Pierre Fauchard fue un frances que se lo conoce como "el padre de la odontología moderna" :D
        OdontologoDTO odontologoDTO = new OdontologoDTO();
        odontologoDTO.setNombre("Pierre");
        odontologoDTO.setApellido("Fauchard");

        odontologoService.agregarOdontologo(odontologoDTO);
        OdontologoDTO odontologoPierre = odontologoService.buscarOdontologo(1);

        assertTrue(odontologoPierre !=null);



    }
}