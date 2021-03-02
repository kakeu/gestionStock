package com.achille.gestionstock.repository;

import com.achille.gestionstock.entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Long, Fournisseur> {
}
