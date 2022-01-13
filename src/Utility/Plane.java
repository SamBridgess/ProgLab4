package Utility;

import Places.Area;
import People.*;

public class Plane {
    protected String name;
    protected boolean availability = false;
    protected Area currentLocation;

    public boolean getAvailability(){ return availability; }
    public String getName(){return name;}
    public void getLocation(){System.out.println(name + " находится на " + currentLocation.getName());}

    public void setAvailability(boolean availability){
        this.availability = availability;
        if(availability == true)
            System.out.println("Самолет освобожден");
        else
            System.out.println("Самолет занят");
    }

    public Plane(String name, Area currentLocation, boolean availability){
        this.name = name;
        this.currentLocation = currentLocation;
        this.availability = availability;
    }

    //-----Содержимое самолета------
    private class PassengerCompartment{
        protected Human passenger;
        public void load(Human passenger){ this.passenger = passenger; }
        public String getInfo(){
            return passenger.getName();
        }
    }
    private class LuggageCompartment{
        protected String loot;
        public void load(String loot){ this.loot = loot; }
        public String getInfo(){
            return loot;
        }
    }
    public static class Motor{
        public static void roar(){
            System.out.println("Мотор ревет");
        }
    }

    PassengerCompartment passC = new PassengerCompartment();
    LuggageCompartment luggC = new LuggageCompartment();

    public void load(Human passenger){ passC.load(passenger);}
    public void load(String loot){ luggC.load(loot);}

    public void getFillingInfo(){ System.out.println("на борту: " + passC.getInfo() + " и " + luggC.getInfo()); }
    //--------------------------

    public void travel(Area destination){
        System.out.print(name + " переместился из " + currentLocation.getName() + " в " + destination.getName()  + " и перевез ");
        getFillingInfo();
        currentLocation = destination;
    }

}
