package com.ucad.kital.raph.gestionProduit.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "T_categorie")
public class CategorieEntity extends BaseEntity {
    private String nom;

    private String description;
    @OneToMany
    Set<ProduitEntity> produitEntities;
}
