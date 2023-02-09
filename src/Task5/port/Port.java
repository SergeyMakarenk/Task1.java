package Task5.port;

import Task5.Ship.Ship;

import java.util.Arrays;


public class Port {
    public Ship ship;
    public Ship[] arrayPort = new Ship[10];

  /* Этот метод создан по подсказкам Idea - работает*/

    public void createPort(){
        for (int i = 0; i < arrayPort.length; i++) {
            Ship ship1 = new Ship(ship.deck);
            ship1.createShip();
            arrayPort[i] = ship1;
        }
    }

   /* Этот метод делал я, так как я это видел, не работает.
   * создается массив arrayPort, и он полностью состоит из объекта ship последней итерации
   * но при выводе ship в цикле они разные. Почему при завершении цикла итоговый массив arrayPort
   * заполнен одним и тем же объектом ship последней итерации?*/

//    public void createPort(){
//        for (int i = 0; i < arrayPort.length; i++) {
//            ship.createShip();
//            arrayPort[i] = ship;
//              System.out.println(ship)
//        }
//         System.out.println(arrayPort)
//    }

    public Port(Ship ship) {
        this.ship = ship;
    }

    @Override
    public String toString() {
        return "Por{" +
                "arrayPort=" + Arrays.toString(arrayPort) +
                '}';
    }
}
