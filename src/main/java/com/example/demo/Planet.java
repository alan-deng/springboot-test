package com.example.demo;
import java.lang.Math;
import java.util.*;

public class Planet {
    private static String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune", "pluto" };
//    distances in km
    private static long[] distFromSunArr = {57900000,108200000,149600000, 227900000, 778600000, 1433500000, 2872500000L, 4495100000L, 5906380000L};
    private String name;
    private long distFromSun;
    public Planet (String planetName) {
        this.name = planetName;
        this.distFromSun = distFromSunArr[java.util.Arrays.asList(planets).indexOf(planetName.toLowerCase())];
    }
    public long getDistance(Planet otherPlanet){
        return Math.abs(distFromSun - otherPlanet.distFromSun);
    }
}
