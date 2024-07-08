package com.TemplateEsame.Template.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "attore")
public class Attore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codice_attore")
    private Integer codiceAttore;

    @Column(name = "nome", nullable = false, length = 150)
    private String nome;

    @Column(name = "anno_nascita", nullable = false)
    private Short annoNascita;

    @Column(name = "nazionalita", nullable = false, length = 2)
    private String nazionalita;
}
