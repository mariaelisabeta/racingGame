package org.fasttrackit;

/**
 * Hello world!
 */

// this is a comment

public class App {
    public static void main(String[] args) {
        Race race = new Race();
        Track track= new Track();
        track.length = 100.5;
        race.track = new Track();


        Engine engine = new Engine ();
        engine.manufacturer = "volvo";

        Car car1 = new Car();
        car1.name = "Volvo";
        car1.color = "black";
        car1.fuelLevel=100;
        car1.mileage=12.5;
        car1.doorCount=4;
        car1.engine = engine;

        Engine engine2= new Engine();
        engine2.manufacturer="honda";

        Car car2 = new Car();
        car2.name="Honda";
        car2.color="red";
        car2.fuelLevel=100;
        car2.mileage=13.;
        car2.doorCount=2;
        car2.engine=engine2;






    }
}
