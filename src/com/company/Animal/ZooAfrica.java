package com.company.Animal;

public class ZooAfrica extends Zoo{
    private boolean killedPeople;

    public ZooAfrica(String name, String species, boolean killedPeople) {
        super(name, species);
        this.killedPeople = killedPeople;
    }

    @Override
    public String toString() {
        return "ZooAfrica{" +
                "killedPeople=" + killedPeople +
                "} " + super.toString();
    }
}
