package com.TemplateEsame.Template.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "film")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codice_film")
    private Integer codiceFilm;

    @Column(name = "titolo", nullable = false, length = 150)
    private String titolo;

    @Column(name = "anno_produzione", nullable = false)
    private Short annoProduzione;

    @Column(name = "nazionalita", nullable = false, length = 2)
    private String nazionalita;

    @Column(name = "regista", nullable = false, length = 150)
    private String regista;
}
