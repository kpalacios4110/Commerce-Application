import { Component, OnInit, inject } from '@angular/core';
import { RouterModule } from '@angular/router';
import { OrderService } from '../Services/order/order.service';
import { Order } from '../model/order.interface';

@Component({
  selector: 'app-order-list',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './order-list.component.html',
})
export default class OrderListComponent implements OnInit {

  private orderService = inject(OrderService);
  
  order: Order[]=[];

  ngOnInit(): void {
    this.orderService.list()
    .subscribe(order => {
    this. order = order;
    });
  }


}
