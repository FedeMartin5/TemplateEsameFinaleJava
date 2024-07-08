package com.TemplateEsame.Template.Controller;

import com.TemplateEsame.Template.Model.Film;
import com.TemplateEsame.Template.Service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    public FilmService filmService;

    @GetMapping("/films")
    public ResponseEntity<List<Film>> getAllFilms(){
        List<Film> films = filmService.getAllFilms();
        return ResponseEntity.ok(films);
    }
}
