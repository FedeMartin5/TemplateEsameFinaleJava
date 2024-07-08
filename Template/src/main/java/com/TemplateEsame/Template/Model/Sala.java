package com.TemplateEsame.Template.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codice_sala")
    private Integer codiceSala;

    @Column(name = "nome", nullable = false, length = 150)
    private String nome;

    @Column(name = "indirizzo", nullable = false, length = 150)
    private String indirizzo;

    @Column(name = "citta", nullable = false, length = 150)
    private String citta;

    @Column(name = "capienza", nullable = false)
    private Short capienza;

}
