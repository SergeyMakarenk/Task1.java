package Task5.Deck;

import Task5.Tank.Cone;
import Task5.Tank.Cub;
import Task5.Tank.Cylinder;
import Task5.Tank.Tank;

import java.util.Random;

/* В данном классе производится расчет массы воды в контейнерах на одной палубе.
 * Рандомные величины:
 * 1. плотность воды (1 или 2)
 * 2. количество и размер контейнеров (2 больших или 4 малых)
 * 3. форма контейнера
 */

public class Deck {

    Random random = new Random();
    private int diametr;
    private int lengthMassiva;
    public Tank[] arrayTanksOnDeck;
    private static final int D = 20;
    private static final int d = 10;
    private static final int L = 2;
    private static final int l = 4;




    public void createArrayTanksOnDeck(){
        typeDeck();
        arrayTanksOnDeck = new Tank[lengthMassiva];
        for (int i = 0; i < lengthMassiva; i++) {
            arrayTanksOnDeck[i] = chooseTank();
        }
    }

    private Tank chooseTank() {
        int randomToThree = random.nextInt(3);
        if (randomToThree == 0) {
            Tank tank = new Cub(diametr);
            tank.volume();
            return tank;
        } else if (randomToThree == 1) {
            Tank tank = new Cone(diametr);
            tank.volume();
            return tank;
        } else {
            Tank tank = new Cylinder(diametr);
            tank.volume();
            return tank;
        }
    }

    private void typeDeck() {
        if (random.nextBoolean()) {
            diametr = D;
            lengthMassiva = L;
        } else {
            diametr = d;
            lengthMassiva = l;
        }
    }

}
