"use strict";
const router_1 = require('@angular/router');
const home_component_1 = require("./home.component");
const register_component_1 = require("./register.component");
const addcar_component_1 = require("./addcar.component");
const carDetails_component_1 = require("./carDetails.component");
const carSearch_component_1 = require("./carSearch.component");
const details_component_1 = require("./details.component");
let routes = [
    { path: 'home', component: home_component_1.HomeComponent },
    { path: 'register', component: register_component_1.RegisterComponent },
    { path: 'addCar', component: addcar_component_1.AddCarComponent },
    { path: 'search', component: carSearch_component_1.SearchCarComponent },
    { path: 'carDetails/:carId', component: carDetails_component_1.CarDetailsComponent },
    { path: 'detail/:id', component: details_component_1.DetailComponent },
    { path: '', redirectTo: '/home', pathMatch: 'full' }
];
exports.configuredRoutes = router_1.RouterModule.forRoot(routes);
//# sourceMappingURL=routes.config.js.map