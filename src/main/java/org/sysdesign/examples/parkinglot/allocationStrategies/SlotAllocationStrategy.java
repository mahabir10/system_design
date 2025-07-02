package org.sysdesign.examples.parkinglot.allocationStrategies;

import org.sysdesign.examples.parkinglot.SlotType;

import java.util.Optional;
import java.util.List;
import org.sysdesign.examples.parkinglot.Slot;

public interface SlotAllocationStrategy {
    Optional<Slot> allocate(List<Slot> slots, SlotType slotType);
}
