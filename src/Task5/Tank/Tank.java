package Task5.Tank;

import java.util.Random;
/* Пакет Tank высчитывает объем воды, помещаемой в контейнер формы куб, цилиндр, конус.
Для вычисления объема цилиндра, конуса и куба можно создать универсальную формулу,
незначительно отличающуюся друг от друга. Общая часть - D*D*H. Где D - диаметр, H - высота.
Оставшаяся часть формулы (обозначим ее variable) отличается.
Для куба variable = 1/2
Для цилиндра variable = PI/4
Для конуса variable = PI/12
 */
public abstract class Tank {

    protected int diametr;
    public int volume;
    public String name;
    Random random = new Random();

    protected abstract double variable();

    public int volume(){
        volume = (int) (diametr*diametr*H()*variable());
        return volume;
    }

    private int H(){
        return random.nextInt(90)+10;
    }

    public Tank(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "volume=" + volume +
                ", name='" + name + '\'' +
                '}';
    }
}
