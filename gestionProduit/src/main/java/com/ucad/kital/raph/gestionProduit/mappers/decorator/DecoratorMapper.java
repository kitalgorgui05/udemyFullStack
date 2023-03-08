package com.ucad.kital.raph.gestionProduit.mappers.decorator;

import com.ucad.kital.raph.gestionProduit.dtos.CategorieDTO;
import com.ucad.kital.raph.gestionProduit.dtos.ProduitDTO;
import com.ucad.kital.raph.gestionProduit.entities.CategorieEntity;
import com.ucad.kital.raph.gestionProduit.entities.ProduitEntity;
import com.ucad.kital.raph.gestionProduit.mappers.EntityMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DecoratorMapper implements EntityMapper {

    private EntityMapper entityMapper;

    @Autowired
    public void setUtilisateurMapper(EntityMapper entityMapper) {
        this.entityMapper = entityMapper;
    }
    @Override
    public ProduitDTO toDTOProd(ProduitEntity produitEntity) {
        return entityMapper.toDTOProd(produitEntity);
    }

    @Override
    public ProduitEntity toEntityProd(ProduitDTO produitDTO) {
        return entityMapper.toEntityProd(produitDTO);
    }

    @Override
    public List<ProduitDTO> toListDTOProd(List<ProduitEntity> produitEntities) {
        return entityMapper.toListDTOProd(produitEntities);
    }

    @Override
    public CategorieDTO toDTOCategorie(CategorieEntity categorieEntity) {
        return entityMapper.toDTOCategorie(categorieEntity);
    }

    @Override
    public CategorieEntity toEntityCategorie(CategorieDTO categorieDTO) {
        return entityMapper.toEntityCategorie(categorieDTO);
    }

    @Override
    public List<CategorieDTO> toDTOListCategorie(List<CategorieEntity> categorieEntities) {
        return entityMapper.toDTOListCategorie(categorieEntities);
    }
}
