package org.fasttrackit;


import java.util.ArrayList;
import java.util.List;

public class Game {

    private Vehicle[] competitors = new Vehicle[10];
    private List<Vehicle> competitorsList = new ArrayList<>();
    private Vehicle firstCompetitor;
    private Vehicle secondCompetitor;

    public void start() {
        System.out.println(competitors.length);


        Car car1 = new Car("Dacia");
        car1.setColor("red");
        car1.setDoorCount(3);
        car1.setMileage(7.5);
        car1.setFuelLevel(50);

        Engine engine1 = new Engine();
        engine1.setManufacturer("Renault");

        car1.setEngine(engine1);

        Car car2 = new Car("Ford");
        car2.setColor("black");
        car2.setDoorCount(2);
        car2.setMileage(8.2);
        car2.setFuelLevel(47);

        Engine engine2 = new Engine();
        engine2.setManufacturer("Ford");

        car2.setEngine(engine2);

        competitors[0] = car1;
        competitors[1] = car2;

        competitorsList.add(car1);
        competitorsList.add(car2);

        for (int i = 0; i < competitors.length; i++) {
            System.out.println("Iteration number " + i);
            System.out.println(competitors[i]);
            competitors[i].accelerate(10, 10);
        }

        for (Vehicle vehicle : competitors) {
            System.out.println(vehicle);
        }

        for (int i = 0; i < competitorsList.size(); i++) {
            System.out.println(competitorsList.get(i));
        }

        for (Vehicle fdsajfas : competitorsList) {
            System.out.println(fdsajfas);
        }

//
//        firstCompetitor = car1;
//        secondCompetitor = car2;
//
//        car1.accelerate(7.2, 6.9);
//
//        System.out.println(car1);
//
//        // Polymorphism demonstration
//        Vehicle rocket = new Rocket("Cheater");
//        rocket.accelerate(100, 60);
    }

    public Vehicle getFirstCompetitor() {
        return firstCompetitor;
    }

    public void setFirstCompetitor(Vehicle firstCompetitor) {
        this.firstCompetitor = firstCompetitor;
    }

    public Vehicle getSecondCompetitor() {
        return secondCompetitor;
    }

    public void setSecondCompetitor(Vehicle secondCompetitor) {
        this.secondCompetitor = secondCompetitor;
    }
}
