import { Injectable, inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Client } from '../../model/client.interface';

@Injectable({
  providedIn: 'root'
})

export class ClientService {
  private http = inject(HttpClient);

  list() {
    return this.http.get<Client[]>('http://localhost:8080/cliente/v1/api');
  }
  get(id: number) {
    return this.http.get<Client>(`http://localhost:8080/cliente/v1/api/${id}`);
  }
  create(client: any) {
    return this.http.post<Client>('http://localhost:8080/cliente/v1/api', client);
  }
  update(id: number, client: any) {
    return this.http.put<Client>(`http://localhost:8080/cliente/v1/api/${id}`, client);
  }
  delete(id: number) {
    return this.http.delete<void>(`http://localhost:8080/cliente/v1/api/${id}`);
  }

}
