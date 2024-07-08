package com.TemplateEsame.Template.Model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name = "users")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer idUser;

    @Column(name = "username", nullable = false, length = 50)
    private String username;

    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @ManyToOne
    @JoinColumn(name = "id_role", nullable = false)
    private UserRoles role;

    public User(String username, String password, UserRoles role) {
        this.username = username;
        this.password = password;
        this.role = role; // Imposta il valore predefinito per id_role
    }
}