package org.sysdesign.examples.parkinglot;

import org.sysdesign.examples.parkinglot.vehicles.Vehicle;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
    private final String ticketId = UUID.randomUUID().toString();

    public Ticket(Vehicle vehicle, Slot slot) {
        this.vehicle = vehicle;
        this.slot = slot;
    }

    public String getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Slot getSlot() {
        return slot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    private final Vehicle vehicle;
    private final Slot slot;
    private final LocalDateTime entryTime = LocalDateTime.now();
    private LocalDateTime exitTime;

    public void close(){
        this.exitTime = LocalDateTime.now();
    }
}
