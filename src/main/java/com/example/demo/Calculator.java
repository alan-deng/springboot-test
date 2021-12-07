package com.example.demo;

public class Calculator {
    double speed;
    String speedUnit;
    Planet planet1;
    Planet planet2;
    public Calculator(String planet1, String planet2, double speed, String sUnit){
//      standard m/s and m
//        need to make new standard km instead of m
        this.planet1 = new Planet(planet1);
        this.planet2 = new Planet(planet2);
        this.speed = speed;
        this.speedUnit = sUnit;
    }

    public long calculateTime(){
        long distance = planet1.getDistance(planet2);
        return (long) (distance/this.speed);
    }

    public void convert(){
//        speed in km/day
        switch (speedUnit) {
            case "km/h" :
                speed = speed * 24;
                break;
            case "mi/h":
                speed = speed * 38.6243;
                break;
            case "m/h":
                speed = speed * 0.024;
                break;
            case "ft/h":
                speed = speed * 0.0073152;
                break;
            case "km/s":
                speed = speed * 86400;
                break;
            case "mi/s":
                speed = speed * 139047;
                break;
            case "m/s":
                speed = speed * 86.4;
                break;
            case "ft/s":
                speed = speed * 26.3347;
                break;
        }
    }
}
