package com.achille.gestionstock.validator;

import com.achille.gestionstock.dto.RolesDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class RoleValidator {
    private static List<String> validate(RolesDto rolesDto){

        List<String> errors = new ArrayList<>();

        if(rolesDto == null || !StringUtils.hasLength(rolesDto.getRoleName())){
            errors.add("veuillez entrer le nom du rôle");
        }

        return errors;
    }
}
