package com.TemplateEsame.Template.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user_roles")
public class UserRoles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role")
    private Integer idRole;

    @Column(name = "role", nullable = false, length = 50)
    private String role;
}
