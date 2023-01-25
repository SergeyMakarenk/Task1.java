package Task2.rainbow;

import java.util.Scanner;

/**
 * В классе реализован вывод названия цветов радуги в зависимости от принятого от пользователя числа,
 * которое соответствует определенному цвету.
 * Сначала предлагается ввести одну цифру для вывода однотонного цвета
 * Потом предлагается ввести две цифры для вывода двухтонного цвета.
 * Так же реализована проверка правильности ввода цифр пользователем
 */

public class Rainbow {

    /* Создаем константы возможных вариантов цветов*/

    public static final String RED = "красный";
    public static final String ORANGE = "оранжевый";
    public static final String YELLOW = "желтый";
    public static final String GREEN = "зеленый";
    public static final String LIGHT_BLUE = "голубой";
    public static final String BLUE = "синий";
    public static final String PURPLE = "фиолетовый";
    public static final String RED1 = "красно-";
    public static final String ORANGE1 = "оранжево-";
    public static final String YELLOW1 = "желто-";
    public static final String GREEN1 = "зелено-";
    public static final String LIGHT_BLUE1 = "голубо-";
    public static final String BLUE1 = "сине-";
    public static final String PURPLE1 = "фиолетово-";

    /* объявляем переменные, принимающие значения от пользователя */

    private String x;
    private String y;
    private String z;

        public void Run(){

            Scanner scanner = new Scanner(System.in);

            /* Первый запрос к пользователю */

            System.out.println("Введите номер цвета");
            System.out.println("1 - Красный");
            System.out.println("2 - Оранжевый");
            System.out.println("3 - Желтый");
            System.out.println("4 - Зеленый");
            System.out.println("5 - Голубой");
            System.out.println("6 - Синий");
            System.out.println("7 - Фиолетовый");
            x = scanner.nextLine();

            /* создаем вспомогательную переменную для проверки правильности ввода однотона */

            String get1 = color(x);  /* Функция color и ее описание после метода Run */

            /* проверяем правильность ввода и выводим название цвета */

            if (get1 == "No")
                System.out.println("Такого цвета нет");
            else
                System.out.println("Вы выбрали "+get1+" цвет");

            /* Второй запрос к пользователю */

            System.out.println("А теперь выберете два числа из таблицы выше, и я составлю из них полутона");
            y = scanner.nextLine();
            z = scanner.nextLine();

            /* создаем вспомогательные переменные для проверки правильности ввода полутонов*/

            String get2 = colorDoDefisa(y);  /* Функция colorDoDefisa и ее описание после метода Run */
            String get3 = color(z);

            /* проверяем правильность ввода и выводим двухтонного цвета */

            if ((get2 == "No") || (get3 == "No"))
                System.out.println("Такого цвета нет");
            else
                System.out.println("Вы выбрали "+get2+get3+" цвет");

        }
        /* Создание функции. Принимает число от User, возвращает
         * соответствующий ему цвет - обычное прилагательное
         */
        String color (String name){
            String i = "No";
            switch (name) {
                    case "1":
                        i = RED;
                        break;
                    case "2":
                        i = ORANGE;
                        break;
                    case "3":
                        i = YELLOW;
                        break;
                    case "4":
                        i = GREEN;
                        break;
                    case "5":
                        i = LIGHT_BLUE;
                        break;
                    case "6":
                        i = BLUE;
                        break;
                    case "7":
                        i = PURPLE;
                        break;
                }
            return i;

        }
    /* Создание функции. Принимает число от User, возвращает
     * соответствующий ему цвет - прилагательное перед дефисом
     */
    String colorDoDefisa (String name){
        String j = "No";
        switch (name) {
            case "1":
                j = RED1;
                break;
            case "2":
                j = ORANGE1;
                break;
            case "3":
                j = YELLOW1;
                break;
            case "4":
                j = GREEN1;
                break;
            case "5":
                j = LIGHT_BLUE1;
                break;
            case "6":
                j = BLUE1;
                break;
            case "7":
                j = PURPLE1;
                break;
        }
        return j;

    }


}
