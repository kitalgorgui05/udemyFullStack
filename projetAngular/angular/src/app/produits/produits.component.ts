import {Component, OnInit} from '@angular/core';
import {ProduitService} from "../service/produit.service";
import {Produit} from "../model/produit";

@Component({
  selector: 'app-produits',
  templateUrl: './produits.component.html',
  styleUrls: ['./produits.component.css']
})
export class ProduitsComponent implements OnInit{
  produits? : Produit[]
  constructor(private produitService:ProduitService) {
  }
  ngOnInit(): void {
    this.getAllProd();
  }

  public getAllProd(){
    this.produitService.getProduits().subscribe(
      (data)=>{
        this.produits=data;
      },
      (error)=>{
        console.log(error);
      }
    )
  }

}
