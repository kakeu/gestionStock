package com.achille.gestionstock.validator;

import com.achille.gestionstock.dto.CommandeClientDto;
import com.achille.gestionstock.dto.CommandeFournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CommandeFournisseurValidator {

    public static List<String> validate(CommandeFournisseurDto commandeFournisseurDto){

        List<String> errors = new ArrayList<>();

        if(commandeFournisseurDto == null || !StringUtils.hasLength(commandeFournisseurDto.getCode())){
            errors.add("veuillez entrer le code de la commande du fournisseur");
        }

        if(commandeFournisseurDto == null || !StringUtils.hasLength((commandeFournisseurDto.getDateCommande()).toString())){
            errors.add("veuillez entrer la date de la commande du fournisseur");
        }

        if(commandeFournisseurDto.getFournisseur() == null){
            errors.add("veuillez entrer le code de la commande du fournisseur");
        }
        return errors;

    }
}
