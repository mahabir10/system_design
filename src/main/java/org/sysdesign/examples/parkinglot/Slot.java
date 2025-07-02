package org.sysdesign.examples.parkinglot;

import org.sysdesign.examples.parkinglot.vehicles.Vehicle;


public class Slot {

    public SlotId getSlotId() {
        return slotId;
    }

    public SlotType getSlotType() {
        return slotType;
    }

    private final SlotId slotId;
    private final SlotType slotType;
    private Vehicle vehicle;

    public Slot(SlotId slotId, SlotType slotType) {
        this.slotId = slotId;
        this.slotType = slotType;
        this.vehicle = null;
    }

    public synchronized boolean tryOccupy(Vehicle vehicle){
        if(this.vehicle == null){
            this.vehicle = vehicle;
            return true;
        }
        return false;
    }

    public synchronized void vacate(){
        this.vehicle = null;
    }

    public boolean isEmpty(){
        return this.vehicle == null;
    }
}
