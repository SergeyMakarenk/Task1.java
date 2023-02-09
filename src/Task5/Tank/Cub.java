package Task5.Tank;

public class Cub extends Tank{
    public String name = "куб";

    @Override
    protected double variable() {
        return (double) 1/2;
    }

    public Cub(int diametr) {
        super(diametr);
    }

    @Override
    public String toString() {
        return "Cub{" +
                "volume=" + volume +
                ", name='" + name + '\'' +
                '}';
    }

}
