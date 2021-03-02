package com.achille.gestionstock.dto;

import com.achille.gestionstock.entities.Adresse;
import com.achille.gestionstock.entities.CommandeFournisseur;
import com.achille.gestionstock.entities.Fournisseur;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Builder
public class FournisseurDto {
    private long id;
    private String nom;
    private AdresseDto adresse;
    private String photo;
    private String mail;
    private String numeroTelephone;
    @JsonIgnore
    private List<CommandeFournisseurDto> commandeFournisseurs;

    public static FournisseurDto fromEntity(Fournisseur fournisseur){
        if(fournisseur == null){
            return null;
        }
        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .nom(fournisseur.getNom())
                .photo(fournisseur.getPhoto())
                .mail(fournisseur.getMail())
                .numeroTelephone(fournisseur.getNumeroTelephone())
                .adresse(AdresseDto.fromEntity(fournisseur.getAdresse()))
                .build();
    }


    public static Fournisseur toEntity(FournisseurDto fournisseurDto){
        if(fournisseurDto == null){
            return null;
        }

        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(fournisseurDto.getId());
        fournisseur.setMail(fournisseurDto.getMail());
        fournisseur.setNom(fournisseurDto.getNom());
        fournisseur.setNumeroTelephone(fournisseurDto.getNumeroTelephone());
        fournisseur.setPhoto(fournisseurDto.getPhoto());
        fournisseur.setAdresse(AdresseDto.toEntity(fournisseurDto.getAdresse()));

        return fournisseur;
    }
}
