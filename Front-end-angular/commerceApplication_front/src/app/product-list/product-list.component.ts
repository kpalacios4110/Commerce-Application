import { Component, OnInit, inject } from '@angular/core';
import { RouterModule } from '@angular/router';
import { ProductService } from '../Services/product/product.service';
import { Product } from '../model/product.interface';

@Component({
  selector: 'app-product-list',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './product-list.component.html',
})
export default class ProductListComponent implements OnInit{

  private productService = inject(ProductService);
  
  product: Product[]=[];

  ngOnInit(): void {
    this.loadAll();
    
  }

  loadAll(){
    this.productService.list()
    .subscribe(product => {
    this.product = product;
    });
  }

  deleteProduct(product:Product){
    this.productService.delete(product.id).subscribe(()=>{
      this.loadAll();
    })
}
}