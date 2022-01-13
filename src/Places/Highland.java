package Places;

import Exeptions.AreaIsEmptyException;
import Interfaces.Surroundable;

import java.util.Arrays;

public class Highland extends Area implements Surroundable {
    Area[] vicinity;
    public Highland(String name, Area[] vicinity) {
        super(name);
        if(vicinity.length == 0)
            throw new AreaIsEmptyException(this);
        this.vicinity = vicinity.clone();
    }
    public void getSurroundingDescription(){
        System.out.print("На " + name + " располагаются: ");
        for(int i = 0; i < vicinity.length; i++)
            System.out.print(vicinity[i].getName() + ", ");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Highland{" +
                "vicinity=" + Arrays.toString(vicinity) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Highland highland = (Highland) o;
        return Arrays.equals(vicinity, highland.vicinity);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(vicinity);
        return result;
    }
}
