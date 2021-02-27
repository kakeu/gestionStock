package com.achille.gestionstock.entities;

public enum TypeMvtStk {

    Entree("Entree en Stock"),
    Sortie("Sortie en Stock");

    private String description;

    TypeMvtStk(String description){
        this.description = description;
    }

}
