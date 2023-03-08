package com.ucad.kital.raph.gestionProduit.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "T_produit")
public class ProduitEntity extends BaseEntity {
    private String nom;
    private Long quantite;
    private Long prix;
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    private CategorieEntity categorie;
}
