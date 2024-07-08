package com.TemplateEsame.Template.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class UserDto {
    private String username;
    private String password;
}

