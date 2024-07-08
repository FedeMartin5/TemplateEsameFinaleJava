package com.TemplateEsame.Template.Service;

import com.TemplateEsame.Template.Model.Film;
import com.TemplateEsame.Template.Repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    @Autowired
    public FilmRepository filmRepository;

    public List<Film> getAllFilms(){
        return filmRepository.GetAllFilms();
    }
}
