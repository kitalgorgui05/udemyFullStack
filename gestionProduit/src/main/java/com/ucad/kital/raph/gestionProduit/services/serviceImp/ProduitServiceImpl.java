package com.ucad.kital.raph.gestionProduit.services.serviceImp;

import com.ucad.kital.raph.gestionProduit.dtos.ProduitDTO;
import com.ucad.kital.raph.gestionProduit.mappers.EntityMapper;
import com.ucad.kital.raph.gestionProduit.repositories.ProduitRepository;
import com.ucad.kital.raph.gestionProduit.services.ProduitService;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService {
    private final ProduitRepository produitRepository;
    private final EntityMapper entityMapper;

    public ProduitServiceImpl(ProduitRepository produitRepository, EntityMapper entityMapper) {
        this.produitRepository = produitRepository;
        this.entityMapper = entityMapper;
    }

    @Override
    public List<ProduitDTO> getAllProduit() {
        return entityMapper.toListDTOProd(produitRepository.findAll());
    }

    @Override
    public ProduitDTO getProduit(String id) {
        return entityMapper.toDTOProd(produitRepository.findById(id).orElse(null));
    }

    @Override
    @Transactional
    public ProduitDTO saveProduit(ProduitDTO produitDTO) {
        return entityMapper.toDTOProd(produitRepository.saveAndFlush(entityMapper.toEntityProd(produitDTO)));
    }

    @Override
    @Transactional
    public ProduitDTO updateProduit(ProduitDTO produitDTO) {
        return entityMapper.toDTOProd(produitRepository.saveAndFlush(
                entityMapper.toEntityProd(produitDTO)
        ));
    }

    @Override
    @Transactional
    public void deleteProduit(String id) {
        produitRepository.deleteById(id);
    }
}
