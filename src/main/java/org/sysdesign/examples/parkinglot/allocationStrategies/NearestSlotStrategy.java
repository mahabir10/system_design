package org.sysdesign.examples.parkinglot.allocationStrategies;

import org.sysdesign.examples.parkinglot.Slot;
import org.sysdesign.examples.parkinglot.SlotType;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NearestSlotStrategy implements SlotAllocationStrategy{

    @Override
    public Optional<Slot> allocate(List<Slot> slots, SlotType slotType) {
        return slots.stream()
                .filter(s -> s.getSlotType() == slotType && s.isEmpty())
                .min(Comparator.comparing(Slot::getSlotId));
    }
}
