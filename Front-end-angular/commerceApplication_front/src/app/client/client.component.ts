import { Component, inject } from '@angular/core';
import { FormBuilder, FormControl, ReactiveFormsModule, Validators } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import { ClientService } from '../Services/client/client.service';

@Component({
  selector: 'app-client',
  templateUrl: './client.component.html',
  imports:[RouterModule, ReactiveFormsModule],
  standalone: true
})
export default class ClientComponent {

  private fb = inject(FormBuilder);
  private clientService = inject(ClientService)
  private router = inject(Router)
   
  form = this.fb.group({

    name:['', [Validators.required]],
    lastname: ['', [Validators.required]],
    address: ['', [Validators.required]],
    email: ['', [Validators.required]],
    telefono: ['', [Validators.required]],

  });

  create(){
    const client = this.form.value;
    this.clientService.create(client)
    .subscribe(() =>{
     this.router.navigate(['/'])
    });
  }
}
