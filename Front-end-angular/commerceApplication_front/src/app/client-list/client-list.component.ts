import { Component, OnInit, inject } from '@angular/core';
import { ClientService } from '../Services/client/client.service';
import { RouterModule } from '@angular/router';
import { Client } from '../model/client.interface';

@Component({
  selector: 'app-client-list',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './client-list.component.html'
 
})
export default class ClientListComponent implements OnInit {

  private clientService = inject(ClientService);
  
  clients: Client[]=[];

  ngOnInit(): void {
  this.loadAll();
  }

  loadAll(){
    this.clientService.list()
    .subscribe(clients => {
    this.clients = clients;
    });
  }

  deleteClient(client:Client){
    this.clientService.delete(client.id).subscribe(()=>{
      this.loadAll();
    })

  }

}
