package com.achille.gestionstock.validator;

import com.achille.gestionstock.dto.LigneCommandeFournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class LigneCommandeFournisseurValidator {

    public static List<String> validate(LigneCommandeFournisseurDto ligneCommandeFournisseurDto){

        List<String> errors = new ArrayList<>();

        if(ligneCommandeFournisseurDto == null || !StringUtils.hasLength((ligneCommandeFournisseurDto.getPrixUnitaire()).toString())){
            errors.add("veuillez entrer le prix unitaire de l'article");
        }

        if(ligneCommandeFournisseurDto == null || !StringUtils.hasLength((ligneCommandeFournisseurDto.getQuantite()).toString())){
            errors.add("veuillez entrer le quantité de l'article");
        }
        if(ligneCommandeFournisseurDto.getArticle() == null){
            errors.add("entrer les articles de la ligne commande");
        }

        if(ligneCommandeFournisseurDto.getCommandeFournisseur() == null) {
            errors.add("entrer les informations de la commande client");
        }
        return errors;

    }
}
