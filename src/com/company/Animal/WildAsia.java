package com.company.Animal;

public class WildAsia extends Wild{
    public boolean edible;


    public WildAsia(String name, String species, boolean edible) {
        super(name, species);
        this.edible = edible;
    }

    @Override
    public String toString() {
        return "WildAsia{" +
                "edible=" + edible +
                "} " + super.toString();
    }
}
