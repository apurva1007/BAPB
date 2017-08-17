"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
const core_1 = require("@angular/core");
const router_1 = require('@angular/router');
let AppComponent = class AppComponent {
    constructor(router) {
        this.router = router;
        this.title = "BAP Bidders";
    }
    register() {
        var registerLink = ['/register'];
        this.router.navigate(registerLink);
    }
    addCar() {
        var addCarLink = ['/addCar'];
        this.router.navigate(addCarLink);
    }
    search() {
        var searchLink = ['/search'];
        this.router.navigate(searchLink);
    }
};
AppComponent = __decorate([
    core_1.Component({
        selector: 'bapb-app',
        template: `<div>
        <div class="topnav" id="myTopnav">
            <h1>{{title}}</h1>
            <input class="button" type="button" value="Register User" (click)="register();" />
            <input class="button" type="button" value="Add Your Car" (click)="addCar();" />
            <input class="button" type="button" value="Search Car" (click)="search();" />
        </div>
       	<router-outlet></router-outlet>      
    </div>`,
        styleUrls: ['../css/top.navigation.component.css']
    }), 
    __metadata('design:paramtypes', [router_1.Router])
], AppComponent);
exports.AppComponent = AppComponent;
//# sourceMappingURL=app.component.js.map