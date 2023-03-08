package com.ucad.kital.raph.gestionProduit.services;

import com.ucad.kital.raph.gestionProduit.dtos.ProduitDTO;

import javax.sound.sampled.Port;
import java.util.List;

public interface ProduitService {
    List<ProduitDTO> getAllProduit();
    ProduitDTO getProduit(String id);
    ProduitDTO saveProduit(ProduitDTO produitDTO);
    ProduitDTO updateProduit(ProduitDTO produitDTO);
    void deleteProduit(String id);
}
