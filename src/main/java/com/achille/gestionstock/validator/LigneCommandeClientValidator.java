package com.achille.gestionstock.validator;

import com.achille.gestionstock.dto.LigneCommandeClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class LigneCommandeClientValidator {

    public static List<String> validate(LigneCommandeClientDto ligneCommandeClientDto){

        List<String> errors = new ArrayList<>();

        if(ligneCommandeClientDto == null || !StringUtils.hasLength((ligneCommandeClientDto.getPrixUnitaire()).toString())){
            errors.add("veuillez entrer le prix unitaire de l'article");
        }

        if(ligneCommandeClientDto == null || !StringUtils.hasLength((ligneCommandeClientDto.getQuantite()).toString())){
            errors.add("veuillez entrer le quantité de l'article");
        }
        if(ligneCommandeClientDto.getArticle() == null){
            errors.add("entrer les articles de la ligne commande");
        }

        if(ligneCommandeClientDto.getCommandeclient() == null) {
            errors.add("entrer les informations de la commande client");
        }
        return errors;
    }
}
