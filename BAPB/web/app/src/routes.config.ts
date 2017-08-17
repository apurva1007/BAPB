import { Routes,RouterModule } from '@angular/router';
import {HomeComponent} from "./home.component";
import {RegisterComponent} from "./register.component";
import {AddCarComponent} from "./addcar.component";
import {CarDetailsComponent} from "./carDetails.component";
import {SearchCarComponent} from "./carSearch.component";
import {DetailComponent} from "./details.component";

let routes:Routes = [
    {path:'home',component:HomeComponent},
    {path:'register',component:RegisterComponent},
    {path:'addCar',component:AddCarComponent},
    {path:'search',component:SearchCarComponent},
    {path:'carDetails/:carId',component:CarDetailsComponent},
    {path:'detail/:id', component:DetailComponent},
    {path:'',redirectTo:'/home',pathMatch:'full'}
];

export const configuredRoutes = RouterModule.forRoot(routes);