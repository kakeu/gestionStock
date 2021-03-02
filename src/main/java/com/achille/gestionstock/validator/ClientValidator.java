package com.achille.gestionstock.validator;

import com.achille.gestionstock.dto.ClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientValidator {

    public static List<String> validate(ClientDto clientDto){

        List<String> errors = new ArrayList<>();

        if(clientDto == null || !StringUtils.hasLength(clientDto.getNom())){
            errors.add("veuillez entrer le nom du client");
        }
        if(clientDto == null || !StringUtils.hasLength(clientDto.getPrenom())){
            errors.add("veuillez entrer le prenom du client");
        }
        if(clientDto == null || !StringUtils.hasLength(clientDto.getMail())){
            errors.add("veuillez entrer l'email du client");
        }
        if(clientDto == null || !StringUtils.hasLength(clientDto.getNumeroTelephone())){
            errors.add("veuillez entrer le numéro de téléphone du client");
        }

        return errors;
    }
}
