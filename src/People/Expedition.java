package People;
import Exeptions.PlaneIsAlreadyInUseException;
import Utility.*;
import Places.*;

public class Expedition extends Human{
    public Expedition(String name) {super(name);}

    public void countOn(Plane[] plane){
        System.out.print(name + " рассчитывает на ");
        for(int i = 0; i < plane.length; i++)
            System.out.print(plane[i].getName() +", ");
        System.out.println();
    }

    public void UsePlaneForConnection(Plane plane) throws PlaneIsAlreadyInUseException {
        if(plane.getAvailability() == true)
            System.out.println(name + " использует " + plane.getName() + " для связи");
        else
            throw new PlaneIsAlreadyInUseException(plane);
    }
    public void stopUsing(Base base){
        System.out.println(name + " отказывается от использования " + base.getName());
    }
    public void resume(String act) {
        System.out.println(name + " продолжает " + act);
    }
}
