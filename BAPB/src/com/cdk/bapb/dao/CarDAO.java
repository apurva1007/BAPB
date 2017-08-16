package com.cdk.bapb.dao;

import com.cdk.bapb.model.Car;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CarDAO {

    @PersistenceContext
    EntityManager entityManager;


    public String update(Car car){
        entityManager.merge(car);
        return car.getCarId();
    }

    public String save(Car car){
        entityManager.persist(car);
        return car.getCarId();
    }


    public Car selectById(String carId){
        return entityManager.find(Car.class,carId);
    }


    public List<Car> selectAll(){
        return entityManager.createQuery("from Car").getResultList();

    }


    public void delete(String carId) {
        Car car = entityManager.find(Car.class,carId);
        entityManager.remove(car);
    }
}