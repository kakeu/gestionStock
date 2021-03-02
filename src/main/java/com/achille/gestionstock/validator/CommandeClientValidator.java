package com.achille.gestionstock.validator;

import com.achille.gestionstock.dto.CommandeClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CommandeClientValidator {

    public static List<String> validate(CommandeClientDto commandeClientDto){

        List<String> errors = new ArrayList<>();

        if(commandeClientDto == null || !StringUtils.hasLength(commandeClientDto.getCodeCommandeClient())){
            errors.add("veuillez entrer le code de la commande du client");
        }

        if(commandeClientDto == null || !StringUtils.hasLength((commandeClientDto.getDateCommande()).toString())){
            errors.add("veuillez entrer la date de la commande du client");
        }

        if(commandeClientDto.getClient() == null){
            errors.add("veuillez entrer le code de la commande du client");
        }
        return errors;

    }
}
