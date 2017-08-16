package com.cdk.bapb.service;

import com.cdk.bapb.dao.CarDAO;
import com.cdk.bapb.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarDAO carDAO;

    @Transactional
    public String add(Car car) {
        return carDAO.save(car);
    }

    @Transactional
    public String modify(Car car) {
        return carDAO.update(car);
    }

    @Transactional
    public Car readById(String carId) {
        return carDAO.selectById(carId);
    }

    @Transactional
    public List<Car> readAll(){
        return carDAO.selectAll();

    }

    @Transactional
    public void remove(String carId) {
        carDAO.delete(carId);
    }

}
