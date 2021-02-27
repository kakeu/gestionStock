package com.achille.gestionstock.dto;


import com.achille.gestionstock.entities.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Builder
@Data
public class CategoryDto {
    private long id;
    private String codeCategorie;
    private String designation;
    @JsonIgnore
    private List<ArticleDto> articles;

    public CategoryDto fromEntity(Category category){
        if(category == null){
            return null;
        }
        return CategoryDto.builder()
                .id(category.getId())
                .codeCategorie(category.getCodeCategorie())
                .designation(category.getDesignation())
                .build();
    }

    public Category toEntity(CategoryDto categoryDto){
        if(categoryDto == null){
            return null;
        }

        Category category = new Category();
        category.setId(categoryDto.getId());
        category.setCodeCategorie(categoryDto.getCodeCategorie());
        category.setDesignation(categoryDto.getDesignation());

        return category;
    }



}
