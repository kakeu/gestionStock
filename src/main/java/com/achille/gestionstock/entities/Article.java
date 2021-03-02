package com.achille.gestionstock.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString
@Entity
@Table(name = "article")
public class Article extends AbstractEntity{

    @Column(name = "codearticle")
    private String codeArticle;
    @Column(name = "designation")
    private String designation;
    @Column(name = "prixunitaireht")
    private BigDecimal prixUnitaireHt;
    @Column(name = "tauxtva")
    private BigDecimal tauxTva;
    @Column(name = "prixunitairettc")
    private BigDecimal prixUnitaireTtc;
    @Column(name = "photo")
    private String photo;
    @Column(name = "identreprise")
    private long idEntreprise;
    @ManyToOne
    @JoinColumn(name = "idcategory")
    private Category category;

    //@OneToMany(mappedBy = "article")
   // private LigneCommandeClient ligneCommandeClient;


}
