import { Component, inject } from '@angular/core';
import { FormBuilder, FormControl, ReactiveFormsModule, Validators } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import { OrderService } from '../Services/order/order.service';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  imports:[RouterModule, ReactiveFormsModule],
  standalone: true
})
export default class OrderComponent {

  private fb = inject(FormBuilder);
  private orderService = inject(OrderService)
  private router = inject(Router)

  form = this.fb.group({

    quantity:['', [Validators.required]],
    date: ['', [Validators.required]],
    total: ['', [Validators.required]],
  });

  create(){
    const order = this.form.value;
    this.orderService.create(order)
    .subscribe(() =>{
     this.router.navigate(['/'])
    });
  }

}
