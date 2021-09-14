package com.company.Animal;

public class ZooNA extends Zoo{
    private boolean abused;

    public ZooNA(String name, String species, boolean abused) {
        super(name, species);
        this.abused = abused;
    }

    @Override
    public String toString() {
        return "ZooNA{" +
                "abused=" + abused +
                "} " + super.toString();
    }
}
