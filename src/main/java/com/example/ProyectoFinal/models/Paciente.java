package com.example.ProyectoFinal.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="Paciente")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private Date fechaAlta;

    @OneToMany(mappedBy = "paciente")
    @JsonIgnore
    private Set<Turno> turnos;
}
