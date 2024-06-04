import { Injectable, inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from '../../model/product.interface';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private http = inject(HttpClient);

  list() {
    return this.http.get<Product[]>('http://localhost:8080/product/v1/api');
  }
  get(id: number) {
    return this.http.get<Product>(`http://localhost:8080/pruduct/v1/api/${id}`);
  }
  create(product: any) {
    return this.http.post<Product>('http://localhost:8080/product/v1/api', product);
  }
  update(id: number, product: any) {
    return this.http.put<Product>(`http://localhost:8080/product/v1/api/${id}`, product);
  }
  delete(id: number) {
    return this.http.delete<void>(`http://localhost:8080/product/v1/api/${id}`);
  }

}
