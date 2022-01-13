import Exeptions.*;
import People.*;
import Places.*;
import Utility.*;
import Enums.*;
public class Main {
    public static void main(String[] args) throws PlaneIsAlreadyInUseException {
        Expedition expedition = new Expedition("Экспедиция");
        Pilot pilot = new Pilot("Летчик");
        Assistant assistant1 = new Assistant("Первый");
        Assistant assistant2 = new Assistant("Второй");

        Base mainBase = new Base("Основная");
        Base temporalBase = new Base("Промежуточная");
        Base arhkem = new Base("Аркхем");
        Area birdmor = new Area("Бирдмор"){
            public String getName(){
                return "Ледник " + name;
            }
        };

        Plane plane1 = new Plane("Самолет №1", mainBase, true);
        Plane plane2 = new Plane("Самолет №2", mainBase, true);
        Plane plane3 = new Plane("Самолет №3", mainBase, true);
        Plane plane4 = new Plane("Самолет №4", mainBase, true);
        Plane plane5 = new Plane("Самолет №5", mainBase, false);

        Plane[] availablePlanes = {plane1, plane2, plane3, plane4};
        expedition.countOn(availablePlanes);

        plane5.getLocation();
        assistant1.watch(plane5);
        assistant2.watch(plane5);
        pilot.watch(plane5);

        plane1.load("аппаратура");
        plane1.load(expedition);
        plane2.load("аппаратура");
        plane2.load(expedition);
        plane1.travel(mainBase);
        plane2.travel(mainBase);

        try{
            expedition.UsePlaneForConnection(plane1);
        }catch(PlaneIsAlreadyInUseException e){
            plane1.setAvailability(true);
            expedition.UsePlaneForConnection(plane1);
        }
        try{
            expedition.UsePlaneForConnection(plane2);
        }catch(PlaneIsAlreadyInUseException e){
            plane2.setAvailability(true);
            expedition.UsePlaneForConnection(plane2);
        }

        Area[] vicinity = {temporalBase, birdmor};
        Highland highland = new Highland("Огромное плоскогорье", vicinity);

        highland.getSurroundingDescription();

        highland.applyWeather(Weather.BLIZZARD);
        highland.applyWeather(Weather.WIND);

        expedition.stopUsing(temporalBase);


        RadioStation.announce("21 ноября",
                "Экспедиция совершила захватывающий беспосадочный " +
                        "полет в течение четырех часов над бескрайней " +
                        "ледяной равниной, окаймленной на западе " +
                        "горной грядой");
        Plane.Motor.roar();
        expedition.resume("путь по радиокомпасу");
       /*




        Area[] vicinity = {temporalBase, birdmor};
        Highland highland = new Highland("Огромное плоскогорье", vicinity);

        highland.getSurroundingDescription();

        highland.applyWeather(Weather.BLIZZARD);
        highland.applyWeather(Weather.WIND);

        expedition.stopUsing(temporalBase);

        Radio.announce("21 ноября",
                "Экспедиция совершила захватывающий беспосадочный " +
                        "полет в течение четырех часов над бескрайней " +
                        "ледяной равниной, окаймленной на западе " +
                        "горной грядой");
        //Motor.roar();
        expedition.resume("путь по радиокомпасу");


        */
    }
}
