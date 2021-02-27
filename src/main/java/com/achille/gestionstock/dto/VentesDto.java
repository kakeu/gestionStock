package com.achille.gestionstock.dto;

import com.achille.gestionstock.entities.LigneVente;
import com.achille.gestionstock.entities.Ventes;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@Data
@Builder
public class VentesDto {
    private long id;
    @JsonIgnore
    private List<LigneVenteDto> ligneVentes;
    private Instant dateVente;
    private String commentaire;

    public static VentesDto fromEntity(Ventes ventes){
        if(ventes == null){
            return null;
        }
        return VentesDto.builder()
                .dateVente(ventes.getDateVente())
                .id(ventes.getId())
                .commentaire(ventes.getCommentaire())
                .build();
    }

    public static Ventes toEntity(VentesDto ventesDto){
        if(ventesDto == null){
            return null;
        }
        Ventes ventes = new Ventes();
        ventes.setId(ventesDto.getId());
        ventes.setCommentaire(ventesDto.getCommentaire());
        ventes.setDateVente(ventesDto.getDateVente());
        return ventes;
    }
}
