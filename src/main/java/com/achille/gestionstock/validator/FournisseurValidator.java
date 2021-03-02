package com.achille.gestionstock.validator;

import com.achille.gestionstock.dto.FournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FournisseurValidator {

    public static List<String> validate (FournisseurDto fournisseurDto){
        List<String> errors = new ArrayList<>();

        if(fournisseurDto == null || !StringUtils.hasLength(fournisseurDto.getNom())){
            errors.add("veuillez entrer le nom du fournisseur");
        }

        if(fournisseurDto == null || !StringUtils.hasLength(fournisseurDto.getMail())){
            errors.add("veuillez entrer le mail du fournisseur");
        }

        if(fournisseurDto == null || !StringUtils.hasLength(fournisseurDto.getNumeroTelephone())){
            errors.add("veuillez entrer le numero de telephone du fournisseur");
        }

        if(fournisseurDto.getAdresse() == null){
            errors.add("veuillez entrer l'adresse du fournisseur");
        }

        return errors;
    }
}
