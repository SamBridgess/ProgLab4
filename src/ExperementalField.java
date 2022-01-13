import People.*;
import Utility.*;
import Places.*;
import Exeptions.*;
public class ExperementalField {
    public static void main(String[] args) throws PlaneIsAlreadyInUseException {
        Base mainBase = new Base("Основная");

        Expedition expedition = new Expedition("Экспедиция");
        Plane plane1 = new Plane("Самолет №1", mainBase, true);
        Plane plane2 = new Plane("Самолет №2", mainBase, true);

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

        Area[] vicinity = {mainBase};
        Highland highland = new Highland("Огромное плоскогорье", vicinity);
        highland.getSurroundingDescription();



        plane1.load(expedition);
        plane1.load("оборудование");
        plane1.getFillingInfo();

        //plane1.travel(arhkem);


        Area birdmor = new Area("Бирдмор"){
            public String getName(){
                return "Ледник " + name;
            }
        };
        Area temporalBase = new Area("Временная"){
            public String getName(){
                return "База " + name;
            }
        };


    }
}
