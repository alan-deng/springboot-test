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
        // 1 km/h => m/s : 0.277778
        // 1 mi/h => m/s : 0.44704
//        speed currently taking m, need to convert to km
        switch (speedUnit) {
            case "km/h" -> speed = 0.277778 * speed;
            case "mi/h" -> speed = 0.44704 * speed;
        }
    }
}
