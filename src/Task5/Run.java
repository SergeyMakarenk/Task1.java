package Task5;

import Task5.Deck.Deck;
import Task5.Ship.Ship;
import Task5.port.Port;

import java.util.Random;

/**
 * В данном классе создаются объекты классов Deck (палуба с контейнерами),
 * Ship (корабль с одной или двумя палубами), Por (порт с 10 кораблями) с учетом их отношения
 * и вычисляется масса воды, первозимой в контейнерахна всех кораблях.
 * Параметры контейнеров - согласно условию задания
 */

public class Run {
    Random random = new Random();

    public void start() {
        Deck deck = new Deck();
        Ship ship = new Ship(deck);
        Port port = new Port(ship);
        port.createPort();

        int massOfWater = 0;
        for (int i = 0; i < port.arrayPort.length; i++) {
            int massOfShip = 0;
            for (int j = 0; j < port.arrayPort[i].arrayShip.length; j++) {
                massOfShip += choosePlotnost() * port.arrayPort[i].arrayShip[j].volume;
            }
            System.out.println("Масса перевозимой воды корабля " + port.arrayPort[i].nameShip + " равна " + massOfShip);
            massOfWater += massOfShip;
        }
        System.out.println("Общая масса воды в порту равна " + massOfWater);

    }

    private int choosePlotnost() {   //для большей наглядности заменил 1000 кг на 1 т. и 2000 кг на 2 т.
        if (random.nextBoolean()) {
            return 1;
        } else {
            return 2;
        }

    }
}


