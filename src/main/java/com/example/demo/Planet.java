package com.example.demo;
import java.lang.Math;
import java.util.*;

public class Planet {
    private static String[] planets = {"mercury", "venus", "earth", "mars" };
    private static int[] distFromSunArr = {11111,22222,33333, 44444};
    private String name;
    private int distFromSun;
    public Planet (String planetName) {
        this.name = planetName;
        this.distFromSun = distFromSunArr[java.util.Arrays.asList(planets).indexOf(planetName.toLowerCase())];
    }
    public int getDistance(Planet otherPlanet){
        return Math.abs(distFromSun - otherPlanet.distFromSun);
    }
}
