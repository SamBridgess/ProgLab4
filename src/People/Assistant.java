package People;
import Utility.*;
public class Assistant extends Human{
    public Assistant(String name) {super(name);}

    public void watch(Plane plane){
        System.out.println("Подручный " + name + " наблюдает за " + plane.getName());

    }
}
