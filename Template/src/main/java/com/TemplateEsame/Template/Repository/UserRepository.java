package com.TemplateEsame.Template.Repository;

import com.TemplateEsame.Template.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value ="SELECT * FROM users WHERE username = :name", nativeQuery = true)
    List<User> findByName(@Param("name") String name);


}
