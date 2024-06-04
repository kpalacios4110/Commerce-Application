import { Component, OnInit  } from '@angular/core';
import { RouterOutlet, RouterLink } from '@angular/router';
import { FormBuilder, FormGroup } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { ClientService } from './Services/client/client.service';
import { ProductService } from './Services/product/product.service';
import { OrderService  } from './Services/order/order.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  imports:[CommonModule, RouterOutlet, RouterLink],
  standalone: true
})

export class AppComponent {

}
