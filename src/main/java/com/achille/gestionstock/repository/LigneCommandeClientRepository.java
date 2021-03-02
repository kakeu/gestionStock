package com.achille.gestionstock.repository;

import com.achille.gestionstock.entities.LigneCommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneCommandeClientRepository extends JpaRepository<Long, LigneCommandeClient> {
}
