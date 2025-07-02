package org.sysdesign.examples.parkinglot.vehicles;

import org.sysdesign.examples.parkinglot.SlotType;

public class Bike extends Vehicle{

    Bike(String licencePlate){
        super(licencePlate);
    }

    @Override
    public SlotType getRequiredSlotType() {
        return SlotType.BIKE;
    }
}
