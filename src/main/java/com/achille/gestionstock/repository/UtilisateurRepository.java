package com.achille.gestionstock.repository;

import com.achille.gestionstock.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository  extends JpaRepository<Long, Utilisateur> {

}
