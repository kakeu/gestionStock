package com.achille.gestionstock.repository;

import com.achille.gestionstock.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Long, Client> {

}
