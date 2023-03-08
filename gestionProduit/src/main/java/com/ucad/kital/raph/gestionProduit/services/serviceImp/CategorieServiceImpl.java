package com.ucad.kital.raph.gestionProduit.services.serviceImp;

import com.ucad.kital.raph.gestionProduit.dtos.CategorieDTO;
import com.ucad.kital.raph.gestionProduit.mappers.EntityMapper;
import com.ucad.kital.raph.gestionProduit.repositories.CategorieRepository;
import com.ucad.kital.raph.gestionProduit.services.CategorieService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategorieServiceImpl implements CategorieService {

    private final CategorieRepository categorieRepository;
    private final EntityMapper entityMapper;

    public CategorieServiceImpl(CategorieRepository categorieRepository, EntityMapper entityMapper) {
        this.categorieRepository = categorieRepository;
        this.entityMapper = entityMapper;
    }

    @Override
    public List<CategorieDTO> getAllCategorie() {
        return entityMapper.toDTOListCategorie(
                categorieRepository.findAll()
        );
    }

    @Override
    public CategorieDTO getCategorie(String id) {
        return entityMapper.toDTOCategorie(categorieRepository.findById(id).orElse(null));
    }

    @Override
    @Transactional
    public CategorieDTO saveCategorie(CategorieDTO categorieDTO) {
        return entityMapper.toDTOCategorie(
                categorieRepository.saveAndFlush(entityMapper.toEntityCategorie(categorieDTO))
        );
    }

    @Override
    @Transactional
    public CategorieDTO updateCategorie(CategorieDTO categorieDTO) {
        return entityMapper.toDTOCategorie(
                categorieRepository.saveAndFlush(entityMapper.toEntityCategorie(categorieDTO))
        );
    }

    @Override
    @Transactional
    public void deleteProduit(String id) {
        categorieRepository.deleteById(id);
    }
}
