package Task5.Tank;

public class Cylinder extends Tank{
    public String name = "цилиндр";
    @Override
    protected double variable() {
        return Math.PI/4;
    }

    public Cylinder(int diametr) {
        super(diametr);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "volume=" + volume +
                ", name='" + name + '\'' +
                '}';
    }

}
