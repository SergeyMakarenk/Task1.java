package Task9;

import Task9.exceptions.AgeException;
import Task9.exceptions.NumberLessZeroException;
import Task9.exceptions.NumberMoreTenException;

import java.util.Scanner;

public class Runner {

    public static final String PROGRAM_WORK = "App is still working";
    public static final String TYPE_NUMBER = "Type number from 0 to 10";
    public static final String TYPE_RESULT = "You typed ";
    public static final String MISTAKE = "You made a mistake";

    public void start() {

        User user = new User("Пятро");
        try {
            user.setAge(-2);
        } catch (AgeException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println(PROGRAM_WORK);
        }

        typeNumber();
    }

    public static void typeNumber(){

        Scanner scanner = new Scanner(System.in);
        System.out.println(TYPE_NUMBER);
        int x = scanner.nextInt();
        try {
            if (x < 0){
                throw new NumberLessZeroException(MISTAKE);
            } else if (x > 10){
                throw new NumberMoreTenException(MISTAKE);
            } else {
                System.out.println(TYPE_RESULT + x);
            }
        } catch (NumberLessZeroException | NumberMoreTenException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println(PROGRAM_WORK);
        }
    }
}
