package com.achille.gestionstock.dto;

import com.achille.gestionstock.entities.Adresse;
import com.achille.gestionstock.entities.Entreprise;
import com.achille.gestionstock.entities.Utilisateur;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Builder
public class EntrepriseDto {
    private long id;
    private String nom;
    private String description;
    private AdresseDto adresse;
    private String codeFiscal;
    private String photo;
    private String mail;
    private String numeroTelephone;
    private String siteWeb;
    @JsonIgnore
    private List<UtilisateurDto> utilisateurs;

    public static EntrepriseDto fromEntity(Entreprise entreprise){
        if(entreprise == null){
            return null;
        }

        return EntrepriseDto.builder()
                .id(entreprise.getId())
                .nom(entreprise.getNom())
                .description(entreprise.getDescription())
                .adresse(AdresseDto.fromEntity(entreprise.getAdresse()))
                .codeFiscal(entreprise.getCodeFiscal())
                .photo(entreprise.getPhoto())
                .mail(entreprise.getMail())
                .numeroTelephone(entreprise.getNumeroTelephone())
                .siteWeb(entreprise.getSiteWeb())
                .build();
    }

    public static Entreprise toEntity(EntrepriseDto entrepriseDto){
        if(entrepriseDto == null){
            return  null;
        }
        Entreprise entreprise = new Entreprise();
        entreprise.setId(entrepriseDto.getId());
        entreprise.setNom(entrepriseDto.getNom());
        entreprise.setPhoto(entrepriseDto.getPhoto());
        entreprise.setCodeFiscal(entrepriseDto.getCodeFiscal());
        entreprise.setDescription(entrepriseDto.getDescription());
        entreprise.setNumeroTelephone(entrepriseDto.getNumeroTelephone());
        entreprise.setSiteWeb(entrepriseDto.getSiteWeb());
        entreprise.setAdresse(AdresseDto.toEntity(entrepriseDto.getAdresse()));
        return entreprise;
    }
}
