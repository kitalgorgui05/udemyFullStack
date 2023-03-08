package com.ucad.kital.raph.gestionProduit.repositories;

import com.ucad.kital.raph.gestionProduit.entities.CategorieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository <CategorieEntity, String> {
}
