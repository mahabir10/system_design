package org.sysdesign.examples.parkinglot;

import org.sysdesign.examples.parkinglot.vehicles.Vehicle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Parking {

    private final List<Level> levels;
    private final TicketRegistry ticketRegistry;
    private final BillingService billingService;

    public Parking(List<Level> levels, TicketRegistry ticketRegistry, BillingService billingService) {
        this.levels = levels;
        this.ticketRegistry = ticketRegistry;
        this.billingService = billingService;
    }

    public Optional<Slot> assignSlot(Vehicle vehicle){
        for(Level level: levels){
            Optional<Slot> slot = level.getAvailableSlot(vehicle);
            if(slot.isPresent() && slot.get().tryOccupy(vehicle)){
                ticketRegistry.createTicket(vehicle, slot.get());
                return slot;
            }
        }
        return Optional.empty();
    }

    public Optional<Double> releaseSlot(Vehicle vehicle){
        Optional<Ticket> ticketOpt = ticketRegistry.closeTicket(vehicle);
        if(ticketOpt.isPresent()){
            Ticket ticket = ticketOpt.get();
            ticket.getSlot().vacate();
            return Optional.of(billingService.calculate(ticket));
        }
        return Optional.empty();
    }

    public Map<Integer, Map<SlotType, Long>> report(){
        Map<Integer, Map<SlotType, Long>> result = new HashMap<>();
        for (Level level: levels){
            result.put(level.getId(), level.report());
        }
        return result;
    }

}
