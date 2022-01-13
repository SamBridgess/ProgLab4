package Exeptions;

import Places.Highland;
import Utility.Plane;

public class AreaIsEmptyException extends RuntimeException{
    public AreaIsEmptyException(Highland highland) {
        super("на " + highland.getName() + " ничего нет");
    };
}
