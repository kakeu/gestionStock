package com.achille.gestionstock.repository;

import com.achille.gestionstock.entities.CommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeFournisseurRepository extends JpaRepository<Long, CommandeFournisseur> {
}
