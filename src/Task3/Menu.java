package Task3;

import java.util.Random;
import java.util.Scanner;

public class Menu {

    /* В методе четыре функции, запускающие решения каждой задачи в отдельности */

    public void start(){
//      task1();
//      task2();
//      task3();
//      task4();

    }

    /* первая задача*/

    public void task1(){

        Cat[] cotDefault = new Cat[10];   /* создаем массив объектов для записи 10 объектов класса cat */
        int i = 0;
        while (i < 10) {
            Cat cat = new Cat();
            cotDefault[i] = cat;
            System.out.println("Кот № "+(i+1)+ "-" + cat.nameCat+" возраст - "+cat.ageCate);
            i++;
        }
    }

    /* вторая задача*/

    public void task2(){

        Cat[] cotGetter = new Cat[10];

        for (int i = 0; i < cotGetter.length; i++) {
            Cat cat = new Cat();
            cotGetter[i] = cat;
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите имя котика");

            String x = scan.nextLine(); /* создаем переменную для принятия имени кота от пользователя */
            cat.setGeNameCat(x);
            System.out.println("Введите возраст котика");
            int y = scan.nextInt();     /* создаем переменную для принятия возраста кота от пользователя */
            cat.setGeAgeCat(y);

            System.out.println("Котика зовут "+cat.getGeNameCat());
            System.out.println("Возраст котика "+cat.getGeAgeCat());

        }
    }

    /* третяя задача */

    public void task3(){
        Scanner scanner = new Scanner(System.in);
        Cat[] cotConstr = new Cat[10];
        int i = 0;
        do {
            System.out.println("Ввелите имя и возраст кота через Enter");
            String x = String.valueOf(scanner.next());
            int y = Integer.valueOf(scanner.next());
            Cat cat = new Cat(x, y);
            cotConstr[i] = cat;
            System.out.println(cat);
            i++;
        } while (i < 9);
    }

    /* четвертая задача */
    public void task4(){
        Cat[] cotGenerator = new Cat[5];
        for (Cat name : cotGenerator){
            Cat cat = new Cat(generatorName(), generatorAge());
            System.out.println(cat);

        }
    }

    /* создаем имя кота */

    private String generatorName(){
        char[] glas = {'а', 'о', 'у', 'ы', 'е', 'э', 'и', 'ю', 'я'};
        char[] soglas = {'б', 'в', 'г', 'д', 'ж', 'з', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ч', 'щ'};

        Random random = new Random();

        /* задаем длину имени котика */
        int longName = random.nextInt(4) + 3;

        /* создаем имя котика */
        char[] name = new char[longName];
        for (int i = 0; i < longName; i++) {
            /* генерируем случайный индекс для каждого из массивов с буквами */
            int indexGlas = random.nextInt(glas.length);
            int indexSoglas = random.nextInt(soglas.length);
            if (i%2 == 0) {
                name[i] = glas[indexGlas];
            }
            else {
                name[i] = soglas[indexSoglas];
            }
        }
        return String.valueOf(name);

    }

    /* создаем возраст кота */
    private int generatorAge(){
        Random random = new Random();
        int age = random.nextInt(27) + 1;
        return age;
    }

}
