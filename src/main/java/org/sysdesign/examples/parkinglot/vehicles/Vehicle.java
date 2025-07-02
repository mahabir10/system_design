package org.sysdesign.examples.parkinglot.vehicles;

import org.sysdesign.examples.parkinglot.SlotType;

public abstract class Vehicle {
    public String getLicencePlate() {
        return licencePlate;
    }

    private final String licencePlate;

    public Vehicle(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public abstract SlotType getRequiredSlotType();
}
