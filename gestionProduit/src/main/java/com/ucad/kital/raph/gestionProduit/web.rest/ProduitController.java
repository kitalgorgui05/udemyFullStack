package com.ucad.kital.raph.gestionProduit.web.rest;

import com.ucad.kital.raph.gestionProduit.dtos.ProduitDTO;
import com.ucad.kital.raph.gestionProduit.services.ProduitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/api/produit")
public class ProduitController {
    private final ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }
    @GetMapping(value = "/all")
    public List<ProduitDTO> getProduits(){
        return produitService.getAllProduit();
    }

    @GetMapping(value = "/{id}")
    public ProduitDTO getProduit(@PathVariable String id){
        return produitService.getProduit(id);
    }

    @PostMapping(value = "/add")
    public ProduitDTO saveProduit(@RequestBody ProduitDTO produitDTO){
        return produitService.saveProduit(produitDTO);
    }

    @PutMapping(value = "/update/{id}")
    public ProduitDTO updateProduit(@RequestBody ProduitDTO produitDTO, @PathVariable("id") String id){
        produitDTO.setId(id);
        return  produitService.updateProduit(produitDTO);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteProduit(@PathVariable("id") String id){
        produitService.deleteProduit(id);
    }

}
