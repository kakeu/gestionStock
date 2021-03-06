package com.achille.gestionstock.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString
@Entity
@Table(name = "client")
public class Client extends AbstractEntity{

    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Embedded
    private Adresse adresse;
   @Column(name = "photo")
    private String photo;
    @Column(name = "identreprise")
    private long idEntreprise;
   @Column(name = "mail")
    private String mail;
   @Column(name = "numerotelephone")
    private String numeroTelephone;

   @OneToMany(mappedBy = "client")
   private List<CommandeClient> commandeClients;
}
