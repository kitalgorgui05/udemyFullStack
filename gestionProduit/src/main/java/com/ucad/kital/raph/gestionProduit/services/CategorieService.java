package com.ucad.kital.raph.gestionProduit.services;

import com.ucad.kital.raph.gestionProduit.dtos.CategorieDTO;
import com.ucad.kital.raph.gestionProduit.dtos.ProduitDTO;

import java.util.List;

public interface CategorieService {
    List<CategorieDTO> getAllCategorie();
    CategorieDTO getCategorie(String id);
    CategorieDTO saveCategorie(CategorieDTO categorieDTO);
    CategorieDTO updateCategorie(CategorieDTO categorieDTO);
    void deleteProduit(String id);
}
