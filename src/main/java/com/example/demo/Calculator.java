package com.example.demo;

public class Calculator {
    double speed;
    String speedUnit;
    Planet planet1;
    Planet planet2;
    public Calculator(String planet1, String planet2, double speed, String sUnit){
//      standard m/s and m
        this.planet1 = new Planet(planet1);
        this.planet2 = new Planet(planet2);
        this.speed = speed;
        this.speedUnit = sUnit;
    }

    public double calculateTime(){
        double distance = planet1.getDistance(planet2);
        return distance/this.speed;
    }

    public void convert(){
        // 1 km/h => m/s : 0.277778
        // 1 mi/h => m/s : 0.44704
        switch (speedUnit) {
            case "km/h" -> speed = 0.277778 * speed;
            case "mi/h" -> speed = 0.44704 * speed;
        }
    }
}
