package com.achille.gestionstock.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString
@Entity
@Table(name = "vente")
public class Ventes extends AbstractEntity{

    @OneToMany(mappedBy = "vente")
    private List<LigneVente> ligneVentes;
    @Column(name = "datevente")
    private Instant dateVente;
    @Column(name = "commentaire")
    private String commentaire;
}
