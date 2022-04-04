package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Giewont", "BIG", true));
        stamps.add(new Stamp("Giewont", "SMALL", true));
        stamps.add(new Stamp("Giewont", "BIG", false));
        stamps.add(new Stamp("Giewont", "BIG", true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
