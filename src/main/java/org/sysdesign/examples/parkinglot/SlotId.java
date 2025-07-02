package org.sysdesign.examples.parkinglot;

public record SlotId(int level, SlotType type, int number) implements Comparable<SlotId>{
    @Override public String toString(){
        return "L" + level + "-" + type + "-" + String.format("%03d", number);
    }

    @Override
    public int compareTo(SlotId o) {
        return Integer.compare(this.number, o.number);
    }
}
