import { Routes,  RouterModule,} from '@angular/router';


export const routes: Routes = [ 
    { path: '',loadComponent: () => import('./home/home.component') },
    { path: 'clientlist',loadComponent: () => import('./client-list/client-list.component')},
    { path: 'client',loadComponent: () => import('./client/client.component')},
    { path: ':id/edit',loadComponent: () => import('./client/client.component')},
    { path: 'productlist',loadComponent: () => import('./product-list/product-list.component')},
    { path: 'product',loadComponent: () => import('./product/product.component')},
    { path: ':id/edit',loadComponent: () => import('./product/product.component')},
    { path: 'orderlist',loadComponent: () => import('./order-list/order-list.component')},
    { path: 'order',loadComponent: () => import('./order/order.component')}
];

