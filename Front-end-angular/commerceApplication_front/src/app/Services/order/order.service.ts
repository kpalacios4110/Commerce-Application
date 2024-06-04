import { Injectable, inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Order } from '../../model/order.interface';

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  private http = inject(HttpClient);

  list() {
    return this.http.get<Order[]>('http://localhost:8080/order/v1/api');
  }
  get(id: number) {
    return this.http.get<Order>(`http://localhost:8080/order/v1/api/${id}`);
  }
  create(order: any) {
    return this.http.post<Order>('http://localhost:8080/order/v1/api', order);
  }


}
