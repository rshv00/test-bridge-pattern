package com.company.detail_system.steering_wheels.vehicles.impl;

import com.company.detail_system.steering_wheels.SteeringWheel;
import com.company.detail_system.steering_wheels.vehicles.Vehicle;

public class Bike implements Vehicle {
    private SteeringWheel steeringWheel;

    public Bike(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    @Override
    public void drive() {
        System.out.println("Bike is being driven");
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }
}
