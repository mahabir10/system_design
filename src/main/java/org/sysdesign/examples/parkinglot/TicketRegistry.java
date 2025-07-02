package org.sysdesign.examples.parkinglot;

import org.sysdesign.examples.parkinglot.vehicles.Vehicle;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class TicketRegistry {
    private final Map<Vehicle, Ticket> activeTickets = new ConcurrentHashMap<>();


    public void createTicket(Vehicle vehicle, Slot slot){
        activeTickets.put(vehicle, new Ticket(vehicle, slot));
    }

    public Optional<Ticket> closeTicket(Vehicle vehicle){
        Ticket ticket = activeTickets.get(vehicle);
        if(ticket != null){
            ticket.close();
            return Optional.of(ticket);
        }
        return Optional.empty();
    }
}
