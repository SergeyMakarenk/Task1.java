package Task5.Tank;

public class Cone extends Tank{

    public String name = "конус";

    @Override
    protected double variable() {
        return Math.PI/12;
    }

    public Cone(int diametr) {
        super(diametr);
    }

    @Override
    public String toString() {
        return "Cone{" +
                "volume=" + volume +
                ", name='" + name + '\'' +
                '}';
    }

}
