package com.achille.gestionstock.validator;

import com.achille.gestionstock.dto.CategoryDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CategoryValidator {

    public static List<String>  validate(CategoryDto categoryDto){
        List<String> errors = new ArrayList<>();

        if(categoryDto == null || !StringUtils.hasLength(categoryDto.getCodeCategorie())){
            errors.add("Veuillez renseigner le code de la categorie");
        }
        return errors;
    }
}
