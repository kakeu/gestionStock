package com.achille.gestionstock.repository;

import com.achille.gestionstock.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Long, Category> {

}
