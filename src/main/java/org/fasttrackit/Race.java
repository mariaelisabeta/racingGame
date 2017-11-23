package org.fasttrackit;

public class Race {
   private Track track;
   private Car firstCompetitor;
   private Car secondCompetitor;

   public void start () {
       Engine engine = new Engine();
       engine.setManufacturer("Volvo");
       firstCompetitor = createCompetitor(engine, "Volvo", "red", 40, 8.5, 4);

       Engine secondEngine = new Engine();
       secondEngine.setManufacturer("Toyota");
       secondCompetitor= createCompetitor(secondEngine, "Volvo", "black", 10.5, 9, 2);


   }



   //nu ar trebui sa avem f multi parametri intr-o metoda
   private Car createCompetitor(Engine engine, String name, String color, double fuelLevel, double mileage, int doorcount) {
       Car competitor = new Car (engine);
       competitor.setName(name);
       competitor.setColor(color);
       competitor.setFuelLevel(fuelLevel);
       competitor.setMileage(mileage);
       competitor.setDoorCount(doorcount);

       return competitor;




   }



    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Car getFirstCompetitor() {
        return firstCompetitor;
    }

    public void setFirstCompetitor(Car firstCompetitor) {
        this.firstCompetitor = firstCompetitor;
    }

    public Car getSecondCompetitor() {
        return secondCompetitor;
    }

    public void setSecondCompetitor(Car secondCompetitor) {
        this.secondCompetitor = secondCompetitor;
    }
}
