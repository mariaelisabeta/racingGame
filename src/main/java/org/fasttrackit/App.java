package org.fasttrackit;

import java.awt.image.ConvolveOp;

/**
 * Hello world!
 */

// this is a comment

public class App {
    public static void main(String[] args) {
        Race race = new Race();
        Track track = new Track();
        track.setLength(100.5);
        race.setTrack(track);

        Engine engine = new Engine();
        engine.setManufacturer("Volvo");


        Car car1 = new Car(engine);
        car1.setName("Volvo");
        car1.setColor("balck");
        car1.setFuelLevel(100.00);
        car1.setMileage(12.5);
        car1.setDoorCount(4);


        Engine engine2 = new Engine();
        engine2.setManufacturer("honda");

        Car car2 = new Car(engine2);
        car2.setName("Honda");
        car2.setColor("red");
        car2.setFuelLevel(100);
        car2.setMileage(13.5);
        car2.setDoorCount(2);


        Vehicle vehicle = new Vehicle();
        vehicle.accelerate(20.5);



    }
}
