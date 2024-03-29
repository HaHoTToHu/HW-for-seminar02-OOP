package HW_2;

public class Shark extends Predator implements Swimable {
    public Shark(String name){
        super(name);
    }

    @Override
    public String say() {
        return "<Jaws are chattering nearby>";
    }

    @Override
    public String toString() {
        return String.format("Shark, %s", super.toString());
    }

    @Override
    public int speedForSwim() {
        return 60;
    }
}