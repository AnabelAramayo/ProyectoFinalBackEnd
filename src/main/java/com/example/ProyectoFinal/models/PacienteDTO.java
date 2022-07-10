package com.example.ProyectoFinal.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString


public class PacienteDTO {

    private Integer id;
    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private Date fechaAlta;
}
