package com.TemplateEsame.Template.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class RecitaId implements Serializable {

    private Integer film;
    private Integer attore;
}