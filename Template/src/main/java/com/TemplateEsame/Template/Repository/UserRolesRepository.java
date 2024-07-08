package com.TemplateEsame.Template.Repository;

import com.TemplateEsame.Template.Model.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRolesRepository extends JpaRepository<UserRoles, Integer> {
}
