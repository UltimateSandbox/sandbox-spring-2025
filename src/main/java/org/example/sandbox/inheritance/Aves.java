package org.example.sandbox.inheritance;

public abstract class Aves implements Animal {
    protected static int count = 0;
    protected int numberOfWings;

    public Aves() {
        count++;
    }
    public void tweet() {
        System.out.println("I am tweeting");
    }

    public abstract void fly();

    public void layEggs() {
        System.out.println("I am laying eggs");
    }

    @Override
    public void eat(String food) {
        System.out.println("I am eating");
    }
}
