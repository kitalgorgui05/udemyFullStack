package com.ucad.kital.raph.gestionProduit.repositories;

import com.ucad.kital.raph.gestionProduit.entities.ProduitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository <ProduitEntity, String> {
}
