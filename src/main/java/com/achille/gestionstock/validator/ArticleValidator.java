package com.achille.gestionstock.validator;

import com.achille.gestionstock.dto.ArticleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {

    public static List<String> validate(ArticleDto articleDto){

        List<String> errors = new ArrayList<>();

        if(articleDto == null || !StringUtils.hasLength(articleDto.getCodeArticle())){
            errors.add("veuillez entrer le code de l'article");
        }
        if(articleDto == null || !StringUtils.hasLength(articleDto.getDesignation())){
            errors.add("veuillez entrer le nom de l'article");
        }
        if(articleDto == null || !StringUtils.hasLength((articleDto.getPrixUnitaireHt()).toString())){
            errors.add("veuillez entrer le prix unitaire ht de l'article");
        }
        if (articleDto == null || !StringUtils.hasLength((articleDto.getTauxTva().toString()))){
            errors.add("veuillez entrer le taux de Tva");
        }
        if(articleDto.getCategory()== null){
            errors.add("veuillez entre la catégorie de l'article");
        }

        return errors;
    }
}
