package com.ucad.kital.raph.gestionProduit.web.rest;

import com.ucad.kital.raph.gestionProduit.dtos.CategorieDTO;
import com.ucad.kital.raph.gestionProduit.services.CategorieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "api/categorie")
public class CategorieController {
    private final CategorieService categorieService;

    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @GetMapping(value = "/all")
    public List<CategorieDTO> getCategories(){
        return  categorieService.getAllCategorie();
    }

    @GetMapping(value = "/{id}")
    public CategorieDTO getCategorie(@PathVariable( "id") String id){
        return  categorieService.getCategorie(id);
    }

    @PostMapping(value = "/add")
    public CategorieDTO saveCategorie(@RequestBody CategorieDTO categorieDTO){
        return categorieService.saveCategorie(categorieDTO);
    }

    @PutMapping(value = "/update/{id}")
    public CategorieDTO updateCategorie(@RequestBody CategorieDTO categorieDTO, @PathVariable("id") String id){
        categorieDTO.setId(id);
        return categorieService.saveCategorie(categorieDTO);
    }
    @DeleteMapping(value = "/delete/{id}")
    public void deleteCategorie(@PathVariable("id") String id){
        categorieService.deleteProduit(id);
    }
}
