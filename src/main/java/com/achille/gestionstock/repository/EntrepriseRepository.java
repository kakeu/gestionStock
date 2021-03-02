package com.achille.gestionstock.repository;

import com.achille.gestionstock.entities.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Long, Entreprise> {

}
