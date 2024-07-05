package com.TemplateEsame.Template.Model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_user;

    private String username;
    private String password;
    private Short id_role;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.id_role = 2; // Imposta il valore predefinito per id_role
    }
}