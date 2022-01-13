package Exeptions;
import Utility.*;
public class PlaneIsAlreadyInUseException extends Exception{
    public PlaneIsAlreadyInUseException(Plane plane){
        super(plane.getName() + " уже используется");
    };
}
