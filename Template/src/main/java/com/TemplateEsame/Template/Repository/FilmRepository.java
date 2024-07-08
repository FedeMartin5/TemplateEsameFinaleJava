package com.TemplateEsame.Template.Repository;

import com.TemplateEsame.Template.Model.Film;
import com.TemplateEsame.Template.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {
    @Query(value ="SELECT * FROM film", nativeQuery = true)
    List<Film> GetAllFilms();
}
