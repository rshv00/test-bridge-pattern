package com.company.detail_system.steering_wheels.vehicles.impl;

import com.company.detail_system.steering_wheels.SteeringWheel;
import com.company.detail_system.steering_wheels.vehicles.Vehicle;

public class Car implements Vehicle {
    private SteeringWheel steeringWheel;

    public Car(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    @Override
    public void drive() {
        System.out.println("Car is being driven");
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }
}
