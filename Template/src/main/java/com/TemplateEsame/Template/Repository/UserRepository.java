package com.TemplateEsame.Template.Repository;

import com.TemplateEsame.Template.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value ="SELECT * FROM users WHERE username = :name", nativeQuery = true)
    List<User> findByName(@Param("name") String name);
}