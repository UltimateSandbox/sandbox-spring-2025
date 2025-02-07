package org.example.sandbox.inheritance;

public class Robin extends Bird {

    public Robin(){
        count++;
    }

    @Override
    public void fly() {
        System.out.println("I am flying like a robin");
    }

    public void count() {
        System.out.println("There are " + count + " birds");
    }

    @Override
    public void tweet() {
        System.out.println("I am tweeting like a robin");
    }
}
