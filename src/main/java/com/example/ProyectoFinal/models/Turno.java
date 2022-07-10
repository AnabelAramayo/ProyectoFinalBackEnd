package com.example.ProyectoFinal.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Turno")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="paciente_id", nullable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name="odontologo_id", nullable = false)
    private Odontologo odontologo;
    private Date fecha;
}
