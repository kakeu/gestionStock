package com.achille.gestionstock.repository;

import com.achille.gestionstock.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Long, Article> {

}
