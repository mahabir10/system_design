package org.sysdesign.examples.parkinglot;

import java.time.Duration;

public class BillingService {

    private final RateCard rateCard;

    public BillingService(RateCard rateCard) {
        this.rateCard = rateCard;
    }

    public double calculate(Ticket ticket){
        long minutes = Duration.between(ticket.getEntryTime(), ticket.getExitTime()).toMinutes();
        return rateCard.getRate(ticket.getSlot().getSlotType()) * minutes;
    }

}
