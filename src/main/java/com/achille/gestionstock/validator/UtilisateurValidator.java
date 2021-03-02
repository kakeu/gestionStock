package com.achille.gestionstock.validator;

import com.achille.gestionstock.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {

    public static List<String> validate(UtilisateurDto utilisateurDto){

        List<String> errors = new ArrayList<>();

        if(utilisateurDto == null || !StringUtils.hasLength(utilisateurDto.getNom())){
            errors.add("Veuillez renseigner le nom d'utilisateurs");
        }
        if(utilisateurDto == null || !StringUtils.hasLength(utilisateurDto.getPrenom())){
            errors.add("Veuillez renseigner le prenom de l'utilisateurs");
        }
        if(utilisateurDto == null || !StringUtils.hasLength(utilisateurDto.getEmail())){
            errors.add("Veuillez renseigner l'email de l'utilisateurs");
        }
        if(utilisateurDto == null || !StringUtils.hasLength(utilisateurDto.getMotDePasse())) {
            errors.add("Veuillez renseigner le mot de passe de l'utilisateurs");
        }
        if(utilisateurDto == null || !StringUtils.hasLength(utilisateurDto.getMotDePasse())) {
            errors.add("Veuillez renseigner le mot de passe de l'utilisateurs");
        }
        if(utilisateurDto == null || !StringUtils.hasLength((utilisateurDto.getDateNaissance()).toString())){
            errors.add("veuillez entre la date de naissance de l'utilisateur");
        }
        if(utilisateurDto == null || utilisateurDto.getAdresse()== null) {
            errors.add("Veuillez renseigner l'adresse de l'utilisateur");
        }else {
            if(!StringUtils.hasLength(utilisateurDto.getAdresse().getAdresse1())){
                errors.add("le champ 'Adresse1' est obligatoire");
            }
            if(!StringUtils.hasLength(utilisateurDto.getAdresse().getCodePostale())){
                errors.add("le champ 'codepostale' est obligatoire");
            }
            if(!StringUtils.hasLength(utilisateurDto.getAdresse().getVille())){
                errors.add("le champ 'ville' est obligatoire");
            }
            if(!StringUtils.hasLength(utilisateurDto.getAdresse().getPays())){
                errors.add("le champ 'pays' est obligatoire");
            }
        }

        return errors;
    }


}
