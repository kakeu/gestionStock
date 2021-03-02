package com.achille.gestionstock.repository;

import com.achille.gestionstock.entities.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository<Long, CommandeClient> {
}
