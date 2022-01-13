package Places;
import Enums.*;
import Interfaces.*;

import java.util.Arrays;
import java.util.Objects;

public abstract class Area implements WeatherApplyable {
    protected String name;
    protected Weather[] weather;

    public String getName(){
        return name;
    }

    public Area(String name){this.name = name;}
    public void applyWeather(Weather weather){
        System.out.println("На области " + name + " " + weather.str());
    }

    @Override
    public String toString() {
        return "Area{" +
                "name='" + name + '\'' +
                ", weather=" + Arrays.toString(weather) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Area area = (Area) o;
        return Objects.equals(name, area.name) && Arrays.equals(weather, area.weather);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(weather);
        return result;
    }
}
