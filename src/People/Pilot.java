package People;
import Utility.*;
public class Pilot extends Human{
    public Pilot(String name) {super(name);}

    public void watch(Plane plane) {
        System.out.println(name + " наблюдает за " + plane.getName());
    }

}
