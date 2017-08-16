package com.cdk.bapb.controller;

import com.cdk.bapb.model.Car;
import com.cdk.bapb.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;
import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

public class CarResourceController {

    @Autowired
    CarService carService;

    @RequestMapping(value = "/add",consumes = APPLICATION_JSON_VALUE ,produces = TEXT_PLAIN_VALUE ,method = RequestMethod.POST)
    public String addCar(@RequestBody Car car){
        System.out.println(car);
        String value = carService.add(car);
        return "Car with vin '"+value+" ' resource added successfully!";
    }

    @RequestMapping(value = "/update/{carId}",consumes = APPLICATION_JSON_VALUE ,produces = TEXT_PLAIN_VALUE ,method = RequestMethod.PUT)
    public String updateCar(@RequestBody Car car, @PathVariable String carId){
        car.setCarId(carId);
        String value = carService.modify(car);
        return "Car with vin '"+value+" ' resource updated successfully!";
    }

    @RequestMapping(value = "/allCars",produces = APPLICATION_JSON_VALUE ,method = RequestMethod.GET)
    public Collection<Car> readAllCarsAsJson(){
        return carService.readAll();
    }

    @RequestMapping(value = "/car/{carId}",produces = APPLICATION_JSON_VALUE ,method = RequestMethod.GET)
    public Car readById(@PathVariable String carId){
        System.out.println("VIN is : "+carId);
        Car car = carService.readById(carId);
        return car;
    }

    @RequestMapping(value = "/delete/{carId}",produces = TEXT_PLAIN_VALUE ,method = RequestMethod.DELETE)
    public String deleteCar(@PathVariable String carId){
        carService.remove(carId);
        return "Car with vin '"+carId+"'resource deleted successfully!";
    }
}
