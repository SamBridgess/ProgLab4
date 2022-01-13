package Places;

public class Base extends Area{
    public Base(String name) {super(name);}
    @Override
    public String getName(){
        return "База " + name;
    }
}
