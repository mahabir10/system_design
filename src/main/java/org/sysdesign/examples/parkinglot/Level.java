package org.sysdesign.examples.parkinglot;

import org.sysdesign.examples.parkinglot.vehicles.Vehicle;

import java.util.List;
import java.util.Optional;
import java.util.Map;
import java.util.stream.Collectors;
import org.sysdesign.examples.parkinglot.allocationStrategies.SlotAllocationStrategy;

public class Level {
    public int getId() {
        return id;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    private final int id;
    private final List<Slot> slots;

    private SlotAllocationStrategy allocationStrategy;

    public Level(int id, List<Slot> slots, SlotAllocationStrategy allocationStrategy) {
        this.id = id;
        this.slots = slots;
        this.allocationStrategy = allocationStrategy;
    }

    public Optional<Slot> getAvailableSlot(Vehicle vehicle){
        return allocationStrategy.allocate(slots, vehicle.getRequiredSlotType());
    }

    public Map<SlotType, Long> report(){
        return slots.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.groupingBy(Slot::getSlotType, Collectors.counting()));
    }

    public void setAllocationStrategy(SlotAllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }


}
