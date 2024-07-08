package com.TemplateEsame.Template.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "recita")
@IdClass(RecitaId.class)
public class Recita {

    @Id
    @ManyToOne
    @JoinColumn(name = "codice_film", nullable = false)
    private Film film;

    @Id
    @ManyToOne
    @JoinColumn(name = "codice_attore", nullable = false)
    private Attore attore;
}
