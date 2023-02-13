package Task7;

import Task7.plants.Plant;

public class PlantOfRobots {
    private static final String NAME = "Urod-";


    public void createRobot(Plant name1, Plant name2, int x){
        System.out.println("Создан робот " + NAME + String.valueOf(x+1) + " с телом " +name1.getName().toString() +
                " и головой " +name2.getName().toString());
    }

}
