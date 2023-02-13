package Task7;


import Task7.Anums.NameOfBodies;
import Task7.Anums.NameOfHeads;
import Task7.plants.Plant;
//import Task7.plants.PlantOfHeads;

public class Run {

    public void start(){
        Plant<NameOfHeads> head1 = new Plant(NameOfHeads.CIRCLE);
        Plant<NameOfHeads> head2 = new Plant(NameOfHeads.SQUARE);
        Plant<NameOfHeads> head3 = new Plant(NameOfHeads.TRIANGLE);
        Plant<NameOfBodies> body1 = new Plant(NameOfBodies.BIG);
        Plant<NameOfBodies> body2 = new Plant(NameOfBodies.MIDDLE);
        Plant<NameOfBodies> body3 = new Plant(NameOfBodies.SMALL);
        Plant[] heads = {head1, head2, head3};
        Plant[] bodies = {body1, body2, body3};

        int count = 0;
        PlantOfRobots[] robots = new PlantOfRobots[9];
        for (int i = 0; i < bodies.length; i++) {
            for (int j = 0; j < heads.length; j++) {
                PlantOfRobots robot = new PlantOfRobots();
                robot.createRobot(bodies[i], heads[j], count);
                robots[count] = robot;
                count++;
            }
        }

    }


}
