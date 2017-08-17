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
const http_1 = require("@angular/http");
let SearchCarComponent = class SearchCarComponent {
    constructor(http) {
        this.http = http;
        this.searchField = "";
        this.searchFieldValue = "";
    }
    ngOnInit() {
    }
    searchCars() {
        var searchURL = "";
        if (this.searchField === "" && this.searchFieldValue === "") {
            searchURL = "/rest/cars";
        }
        else {
            searchURL = "/rest/car/" + this.searchField + "/" + this.searchFieldValue;
        }
        var requestHeaders = new http_1.Headers({ 'Accept': 'application/json' });
        var options = new http_1.RequestOptions({ headers: requestHeaders });
        this.http.get(searchURL, options).subscribe(res => this.cars = res.json());
    }
};
SearchCarComponent = __decorate([
    core_1.Component({
        selector: 'search',
        templateUrl: '../partials/carSearch.component.html'
    }), 
    __metadata('design:paramtypes', [http_1.Http])
], SearchCarComponent);
exports.SearchCarComponent = SearchCarComponent;
//# sourceMappingURL=carSearch.component.js.map