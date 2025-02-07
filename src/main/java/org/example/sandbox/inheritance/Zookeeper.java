package org.example.sandbox.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Zookeeper {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();

        Aves aves1 = new Crow();
        Aves aves2 = new Robin();
        Aves aves3 = new Bird();

        List<Aves> aves = new ArrayList<>();
        aves.add(aves1);
        aves.add(aves2);
        aves.add(aves3);

        for (Aves bird : aves) {
            bird.fly();
            bird.eat("seeds");
            bird.tweet();
        }

    }
}
