package com.company.detail_system.steering_wheels;

import com.company.detail_system.steering_wheels.steering_systems.SteeringSystem;
import com.company.detail_system.steering_wheels.steering_systems.impl.BluetoothSignalingSystem;

public class RefinedSteeringWheel extends SteeringWheel {

    public RefinedSteeringWheel(SteeringSystem steeringSystem, BluetoothSignalingSystem bluetoothSignalingSystem) {
        super(steeringSystem, bluetoothSignalingSystem);
    }

    void steerInAutopilot() {
        System.out.println("Autopilot is on");
    }

}
