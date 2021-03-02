package com.achille.gestionstock.validator;

import com.achille.gestionstock.dto.LigneVenteDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class LigneVenteValidator {

    public static List<String> validate(LigneVenteDto ligneVenteDto){

        List<String> errors = new ArrayList<>();

        if(ligneVenteDto == null || !StringUtils.hasLength((ligneVenteDto.getPrixUnitaire()).toString())){
            errors.add("Veuillez entrer le prix unitaire");
        }
        if(ligneVenteDto == null || !StringUtils.hasLength((ligneVenteDto.getQuantite()).toString())){
            errors.add("Veuillez entrer la quantité");
        }
        if(ligneVenteDto.getVente() == null){
            errors.add("entrer les ventes");
        }

        return errors;
    }
}
