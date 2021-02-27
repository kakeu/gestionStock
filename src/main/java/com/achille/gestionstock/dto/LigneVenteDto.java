package com.achille.gestionstock.dto;

import com.achille.gestionstock.entities.LigneVente;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {
    private long id;
    private BigDecimal quantite;
    private VentesDto vente;
    private BigDecimal prixUnitaire;

    public static LigneVenteDto fromEntity(LigneVente ligneVente){
        if(ligneVente == null){
            return  null;
        }
        return LigneVenteDto.builder()
                .id(ligneVente.getId())
                .quantite(ligneVente.getQuantite())
                .prixUnitaire(ligneVente.getPrixUnitaire())
                .vente(VentesDto.fromEntity(ligneVente.getVente()))
                .build();
    }

    public static LigneVente toEntity(LigneVenteDto ligneVenteDto){
        if(ligneVenteDto == null){
            return null;
        }
        LigneVente ligneVente = new LigneVente();
        ligneVente.setId(ligneVenteDto.getId());
        ligneVente.setPrixUnitaire(ligneVenteDto.getPrixUnitaire());
        ligneVente.setQuantite(ligneVenteDto.getQuantite());
        ligneVente.setVente(VentesDto.toEntity(ligneVenteDto.getVente()));
        return ligneVente;
    }

}
