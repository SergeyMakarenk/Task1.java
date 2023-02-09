package Task5.Ship;

import Task5.Deck.Deck;
import Task5.Tank.Tank;

import java.util.Arrays;
import java.util.Random;

public class Ship {

    Random random = new Random();
    public Deck deck;
    public Tank[] arrayShip;
    public String nameShip;

    public void createShip(){
        nameShip = String.valueOf(random.nextInt(999));

        if (random.nextBoolean()) {
            deck.createArrayTanksOnDeck();
            arrayShip = deck.arrayTanksOnDeck;
        } else {
            deck.createArrayTanksOnDeck();
            Tank[] x = deck.arrayTanksOnDeck;
            deck.createArrayTanksOnDeck();
            Tank[] y = deck.arrayTanksOnDeck;
            arrayShip = new Tank[x.length + y.length];
            System.arraycopy(x, 0, arrayShip, 0, x.length);
            System.arraycopy(y, 0, arrayShip, x.length, y.length);
        }
    }

    public Ship(Deck deck) {
        this.deck = deck;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "arrayShip=" + Arrays.toString(arrayShip) +
                ", nameShip='" + nameShip + '\'' +
                '}';
    }
}
