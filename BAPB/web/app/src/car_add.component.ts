import {Component} from "@angular/core";
import {Http,Headers,RequestOptions} from "@angular/http";

import {Car} from "./car";

@Component({
	selector:'bapb-app',
    templateUrl:'../partials/car.component.html',
    styleUrls:['../css/car.component.styles.css'],
})
export class CarComponent{

	title:string ="Car Form";
	car:Car;
	successMessage:string;
    errorMessage:string;


    constructor(private http:Http) {
        this.car = new Car(1001, "Audi", "Q7", "2007", 56746738, 6000000, new Date("February 4, 2016 10:13:00"), 10);
    }

    addCar() {
        console.log("Inside addCar()!!!!");
        let addUrl = "/rest/add";

        var requestHeaders = new Headers({'Content-Type': 'application/json'});
        var options = new RequestOptions({headers: requestHeaders});

        // this.car.logo = this.car.make + '-' + this.car.model + '.png';
        //this.http.post(addUrl,this.car,options).subscribe(res => this.successMessage = res.toString());
        this.http.post(addUrl, this.car, options).subscribe(
            res => {
                this.successMessage = res.toString();
                console.log(res.text());
                this.errorMessage=""
            },
            error => {
                this.errorMessage = <any>error;
                this.successMessage = ""
            });
    }
}


