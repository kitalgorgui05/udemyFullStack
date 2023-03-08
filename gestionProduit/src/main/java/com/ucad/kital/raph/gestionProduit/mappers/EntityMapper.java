package com.ucad.kital.raph.gestionProduit.mappers;

import com.ucad.kital.raph.gestionProduit.dtos.CategorieDTO;
import com.ucad.kital.raph.gestionProduit.dtos.ProduitDTO;
import com.ucad.kital.raph.gestionProduit.entities.CategorieEntity;
import com.ucad.kital.raph.gestionProduit.entities.ProduitEntity;
import com.ucad.kital.raph.gestionProduit.mappers.decorator.DecoratorMapper;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
@DecoratedWith(DecoratorMapper.class)
public interface EntityMapper {
    ProduitDTO toDTOProd(ProduitEntity produitEntity);
    ProduitEntity toEntityProd(ProduitDTO produitDTO);
    List<ProduitDTO> toListDTOProd(List<ProduitEntity> produitEntities);

    CategorieDTO toDTOCategorie(CategorieEntity categorieEntity);
    CategorieEntity toEntityCategorie(CategorieDTO categorieDTO);
    List<CategorieDTO> toDTOListCategorie( List<CategorieEntity> categorieEntities);
}
