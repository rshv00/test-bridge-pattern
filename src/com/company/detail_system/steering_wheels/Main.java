package com.company.detail_system.steering_wheels;

import com.company.detail_system.steering_wheels.steering_systems.impl.BluetoothSignalingSystem;
import com.company.detail_system.steering_wheels.steering_systems.impl.RudderSteeringSystem;
import com.company.detail_system.steering_wheels.types.Direction;
import com.company.detail_system.steering_wheels.vehicles.impl.Boat;

public class Main {
    public static void main(String[] args) {
        //Човен з покращеним рулем який працює по штурвальному принципу, і блютузною сигналізацією
        Boat boat = new Boat(new RefinedSteeringWheel(new RudderSteeringSystem(), new BluetoothSignalingSystem()));

        boat.drive();
        boat.getSteeringWheel().signal();
        boat.getSteeringWheel().turnSteeringWheel(Direction.RIGHT);
        boat.getSteeringWheel().turnSteeringWheel(Direction.LEFT);
    }
}
