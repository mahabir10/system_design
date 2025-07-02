package org.sysdesign.examples.parkinglot;

import java.util.Map;

public class RateCard {

    private final Map<SlotType, Double> perMinuteRates;

    public RateCard(Map<SlotType, Double> perMinuteRates) {
        this.perMinuteRates = perMinuteRates;
    }

    public double getRate(SlotType slotType) {
        return perMinuteRates.getOrDefault(slotType, 0.0);
    }
}
