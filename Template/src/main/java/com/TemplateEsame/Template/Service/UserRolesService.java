package com.TemplateEsame.Template.Service;

import com.TemplateEsame.Template.Model.UserRoles;
import com.TemplateEsame.Template.Repository.UserRolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRolesService {
    @Autowired
    private UserRolesRepository userRolesRepository;

    public UserRoles getRoleById(int id) {
        return userRolesRepository.findById(id).orElse(null);
    }
}
