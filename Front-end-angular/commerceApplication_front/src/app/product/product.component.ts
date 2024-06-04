import { Component, inject } from '@angular/core';
import { FormBuilder, FormControl, ReactiveFormsModule, Validators } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import { ProductService } from '../Services/product/product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  imports:[RouterModule, ReactiveFormsModule],
  standalone: true
})
export default class ProductComponent {
 
  private fb = inject(FormBuilder);
  private producService = inject(ProductService)
  private router = inject(Router)

  form = this.fb.group({

    name:['', [Validators.required]],
    category: ['', [Validators.required]],
    stock: ['', [Validators.required]],
    cost: ['', [Validators.required]]
  });

  create(){
    const product = this.form.value;
    this.producService.create(product)
    .subscribe(() =>{
     this.router.navigate(['/'])
    });
  }
}
