/*
 *Сергей Макаренко
 *
 * Домашнее задание №1 по курсу основы программирования Java
 *
 * Пользуйтесь, кто хочет
 */
package Task1;

public class Task1 {

    /* Объявление глобальных переменных */
    private static byte little = 3;
    private static short small = 200;
    private static int middle = 1000;
    private static char letter = 'S';
    private static String word = "nightmare";
    private static double point1 = 10.1;
    private static Integer in = 246;
    private static Double d1 = 2.5;
    private static Boolean bo = true;

    public static void main(String[] args) {

        /* Создание локальных переменных, оболочек переменных и их приведение */

        short s = little;         //Неявное приведение byte к short
        int i1 = small;           //Неявное приведение short к int
        long big = 100_000_000L;  //Приведение int к long
        float flo = 56.35f;
        boolean logical = false;
        int i = (int)letter;      //Приведение char к int
        float f = letter;         //Приведение char к float
        float point2 = 10.2f;     //Приведение double к float
        double d = (double)flo;   //Приведение float к double
        Character ch = 'f';
        Byte by = (byte)9;
        Float fl = 0.2F;


        /* Создание объектов на основе класса Test */

        Test test1 = new Test();
        Test test2 = new Test();

        /* Работа с сеттерами и геттерами */

        System.out.println("Работа с сеттерами \nПеременная d1 до изменения = "+test2.getD1());
        test2.setD1(20.0);
        System.out.println("Переменная d1 после изменения = "+test2.getD1());
        System.out.println("Переменная letter до изменения = "+test1.getLetter());
        test1.setLetter('g');
        System.out.println("Переменная letter до изменения = "+test1.getLetter());

        /* Вывод всех переменных на консоль */

        System.out.println("\nВывод всех переменных класса Task1\nlittle = "+little);
        System.out.println("small = "+small);
        System.out.println("middle = "+middle);
        System.out.println("letter = "+letter);
        System.out.println("word = "+word);
        System.out.println("point1 = "+point1);
        System.out.println("in = "+in);
        System.out.println("d1 = "+d1);
        System.out.println("bo = "+bo);
        System.out.println("s = "+s);
        System.out.println("i1= "+i1);
        System.out.println("big = "+big);
        System.out.println("logical = "+logical);
        System.out.println("i = "+i);
        System.out.println("f = "+f);
        System.out.println("point2 = "+point2);
        System.out.println("Переменная типа float flo = "+flo);
        System.out.println("Переменная типа double, приведенная из float d = "+d);
        System.out.println("ch = "+ch);
        System.out.println("by = "+by);
        System.out.println("fl = "+fl);


    }
}
