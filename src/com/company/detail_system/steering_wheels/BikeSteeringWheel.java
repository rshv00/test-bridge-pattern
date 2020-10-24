package com.company.detail_system.steering_wheels;

import com.company.detail_system.steering_wheels.steering_systems.SteeringSystem;
import com.company.detail_system.steering_wheels.steering_systems.impl.BluetoothSignalingSystem;

public class BikeSteeringWheel extends SteeringWheel {
    public BikeSteeringWheel(SteeringSystem steeringSystem, BluetoothSignalingSystem bluetoothSignalingSystem) {
        super(steeringSystem, bluetoothSignalingSystem);
    }
}
