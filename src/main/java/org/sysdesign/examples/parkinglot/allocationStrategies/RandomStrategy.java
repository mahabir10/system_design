package org.sysdesign.examples.parkinglot.allocationStrategies;

import org.sysdesign.examples.parkinglot.Slot;
import org.sysdesign.examples.parkinglot.SlotType;

import java.util.List;
import java.util.Optional;

public class RandomStrategy implements SlotAllocationStrategy{

    @Override
    public Optional<Slot> allocate(List<Slot> slots, SlotType slotType) {
        return slots.stream()
                .filter(s -> s.getSlotType() == slotType && s.isEmpty())
                .findAny();
    }
}
