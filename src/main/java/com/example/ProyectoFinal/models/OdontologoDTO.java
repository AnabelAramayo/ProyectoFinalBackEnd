package com.example.ProyectoFinal.models;

import lombok.*;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class OdontologoDTO {

    private Integer id;
    private String nombre;
    private String apellido;
    private Integer matricula;
}
