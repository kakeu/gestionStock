package com.achille.gestionstock.validator;

import com.achille.gestionstock.dto.MvtStkDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class MvtStkValidator {

    private static List<String> validate(MvtStkDto mvtStkDto){

        List<String> errors = new ArrayList<>();

        if(mvtStkDto == null || !StringUtils.hasLength((mvtStkDto.getDateMvt()).toString())){
            errors.add("veuillez entrer la date du mouvements");
        }
        if(mvtStkDto == null || !StringUtils.hasLength((mvtStkDto.getQuantite()).toString())){
            errors.add("veuillez entrer la quantité du mouvements");
        }
        if(mvtStkDto == null || !StringUtils.hasLength((mvtStkDto.getTypeMvt()).toString())){
            errors.add("veuillez entrer la date du mouvements");
        }
        if(mvtStkDto.getArticle() == null){
            errors.add("veuillez entre les articles");
        }
        return errors;
    }
}
