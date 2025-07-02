package org.sysdesign.examples.parkinglot.vehicles;

import org.sysdesign.examples.parkinglot.SlotType;

public class Car extends Vehicle{

    Car(String licencePlate){
        super(licencePlate);
    }

    @Override
    public SlotType getRequiredSlotType() {
        return SlotType.CAR;
    }

}
