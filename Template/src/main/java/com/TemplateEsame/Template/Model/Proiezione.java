package com.TemplateEsame.Template.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "proiezione")
public class Proiezione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codice_proiezione")
    private Integer codiceProiezione;

    @ManyToOne
    @JoinColumn(name = "codice_film", nullable = false)
    private Film film;

    @ManyToOne
    @JoinColumn(name = "codice_sala", nullable = false)
    private Sala sala;

    @Column(name = "data_proiezione", nullable = false)
    private Timestamp dataOra;

    @Column(name = "incasso", nullable = false)
    private Double incasso;
}
