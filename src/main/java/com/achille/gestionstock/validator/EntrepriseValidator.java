package com.achille.gestionstock.validator;

import com.achille.gestionstock.dto.EntrepriseDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EntrepriseValidator {

    public static List<String> validate (EntrepriseDto entrepriseDto){
        List<String> errors = new ArrayList<>();

        if(entrepriseDto == null || !StringUtils.hasLength(entrepriseDto.getNom())){
            errors.add("veuillez entrer le nom de l'entreprise");
        }

        if(entrepriseDto == null || !StringUtils.hasLength(entrepriseDto.getDescription())){
            errors.add("veuillez entrer la description de l'entreprise");
        }

        if(entrepriseDto == null || !StringUtils.hasLength(entrepriseDto.getCodeFiscal())){
            errors.add("veuillez entrer le code fiscal de l'entreprise");
        }

        if(entrepriseDto == null || !StringUtils.hasLength(entrepriseDto.getNumeroTelephone())){
            errors.add("veuillez entrer le numero de telephone de l'entreprise");
        }
        if(entrepriseDto.getAdresse() == null){
            errors.add("veuillez entrer l'adresse de l'entreprise");
        }

        return errors;
    }
}
