import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Produit} from "../model/produit";

@Injectable({
  providedIn: 'root'
})
export class ProduitService {


  constructor(private httpClient: HttpClient) { }
  url="http://localhost:8082/api/produit/"
  public getProduits():Observable<Produit[]>{
    return this.httpClient.get<Produit[]>(this.url+"all")
  }
  public getProduit(id:string):Observable<Produit>{
    return this.httpClient.get<Produit>(this.url+"{id}")
  }
}
