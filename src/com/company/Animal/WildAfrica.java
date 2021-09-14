package com.company.Animal;

public class WildAfrica extends Wild{
    private boolean endangered;

    public WildAfrica(String name, String species, boolean endangered) {
        super(name, species);
        this.endangered = endangered;
    }

    @Override
    public String toString() {
        return "WildAfrica{" +
                "endangered=" + endangered +
                "} " + super.toString();
    }
}
