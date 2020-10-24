package com.company.detail_system.steering_wheels;

import com.company.detail_system.steering_wheels.steering_systems.SteeringSystem;
import com.company.detail_system.steering_wheels.steering_systems.impl.BluetoothSignalingSystem;
import com.company.detail_system.steering_wheels.types.Direction;

public class SteeringWheel {
    private SteeringSystem steeringSystem;
    private BluetoothSignalingSystem bluetoothSignalingSystem;

    public SteeringWheel(SteeringSystem steeringSystem, BluetoothSignalingSystem bluetoothSignalingSystem) {
        this.steeringSystem = steeringSystem;
        this.bluetoothSignalingSystem = bluetoothSignalingSystem;
    }

    void turnSteeringWheel(final Direction direction) {
        System.out.println("turned steering wheel to: " + direction);
    }

    void signal() {
        System.out.println("Signaled");
    }

    public SteeringSystem getSteeringSystem() {
        return steeringSystem;
    }

    public BluetoothSignalingSystem getBluetoothSignalingSystem() {
        return bluetoothSignalingSystem;
    }
}
