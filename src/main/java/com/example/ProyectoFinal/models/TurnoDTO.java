package com.example.ProyectoFinal.models;

import lombok.*;

import javax.persistence.Entity;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class TurnoDTO {

    private Integer id;
    private Paciente paciente;
    private Odontologo odontologo;
    private Date fecha;
}
