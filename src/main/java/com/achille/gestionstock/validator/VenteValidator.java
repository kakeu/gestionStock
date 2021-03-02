package com.achille.gestionstock.validator;

import com.achille.gestionstock.dto.VentesDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class VenteValidator {

    private static List<String> validate(VentesDto ventesDto){
        List<String> errors = new ArrayList<>();

        if(ventesDto == null || !StringUtils.hasLength(ventesDto.getCommentaire())){
            errors.add("veuillez entrer le commentaire");
        }
        if(ventesDto == null || !StringUtils.hasLength((ventesDto.getDateVente()).toString())){
            errors.add("veuillez entrer la date de la vente");
        }

        if(ventesDto.getLigneVentes() == null) {
            errors.add("veuillez entrer la ligne de vente");
        }

        return errors;
    }
}
