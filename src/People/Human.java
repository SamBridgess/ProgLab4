package People;

import java.util.Objects;

import Utility.*;
public abstract class Human {
    protected String name;
    public String getName(){
        return name;
    }
    Human(String name){this.name = name;}

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
