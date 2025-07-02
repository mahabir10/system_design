package org.sysdesign.examples.parkinglot.vehicles;

import org.sysdesign.examples.parkinglot.SlotType;

public class Truck extends Vehicle{

    Truck(String licencePlate){
        super(licencePlate);
    }

    @Override
    public SlotType getRequiredSlotType() {
        return SlotType.TRUCK;
    }
}
