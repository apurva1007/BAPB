import {Component} from "@angular/core";
import {Http,Headers,RequestOptions} from "@angular/http";

@Component({
    selector:'detail',
    templateUrl:'../../partials/details.html'
})
export class DetailComponent{

    constructor(private http:Http) {
        console.log("in details");
    }


}


