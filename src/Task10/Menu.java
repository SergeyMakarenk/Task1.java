package Task10;

import Task10.Exceptions.MainMenuException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Menu {

    private static List<Goods> listOfGoods = new ArrayList<>();

    public static final String MAIN_MENU = """
            Добро пожаловать в магазин на диване!
            1 - перейти к покупке товаров
            2 - перейти в корзину
            3 - оформить заказ
            0 - выйти из магазина""";
    public static final String BUY_MENU = """
            Для добавления товара в корзину введите id товара и Enter
            0 - выйти в главное меню""";
    public static final String READ_FROM_FILE = "Товары, доступные к покупке";
    public static final String BUY_MENU_ONE = "Товар добавлен в корзину";
    public static final String READ_FROM_LIST_ONE = "Ваша корзина пуста!";
    public static final String READ_FROM_LIST_TWO = "Товары в Корзине:";
    public static final String BASKET_MENU_ONE = """
            для удаления товара введите id товара и Enter
            0 - для выхода из корзины в главное меню""";
    public static final String BASKET_MENU_TWO = "Товар удален из корзины";
    public static final String EXCEPTION_ONE = "Такого варианта нет";
    public static final String EXCEPTION_TWO = "Вы ввели не число";
    public static final String EXCEPTION_THREE = "Такого товара в корзине нет";
    public static final String ORDER_MENU_ONE = "Заказ от ";
    public static final String ORDER_MENU_TWO = "Ожидаемая дата поставки ";
    public static final String ORDER_MENU_THREE = "Заказ успешно сформирован. Ожидаемая дата поставки ";
    public static final String ORDER_MENU_FOUR = "Для выхода в главное меню нажмите любую клавишу и Enter";
    public static final String ORDER_MENU_FIVE = "Ваша корзина пуста. Положите товары в корзину!";


            Scanner scanner = new Scanner(System.in);

    public void mainMenu() {
        System.out.println(MAIN_MENU);
        Integer choiceUser = null;
        while (true) {
            String stringChoiceUser = scanner.nextLine();
            try {
                choiceUser = Integer.parseInt(stringChoiceUser);
                if (choiceUser < 0 || choiceUser > 3) {
                    throw new MainMenuException(EXCEPTION_ONE);
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println(EXCEPTION_TWO);
            } catch (MainMenuException e) {
                System.err.println(e.getMessage());
            }
        }
        switch (choiceUser) {
            case 1:
                buyMenu();
                break;
            case 2:
                basketMenu();
                break;
            case 3:
                orderMenu();
                break;
            case 0:
                System.exit(0);
        }
    }

    private void buyMenu() {
        readFromFileGoods();
        System.out.println(BUY_MENU);
        Runner runner = new Runner();
        Map<Integer, Goods> map = runner.getMap();
        Set<Integer> integers = map.keySet();
        while (true) {
            String stringChoiceUser = scanner.nextLine();
            try {
                int choiceUser = Integer.parseInt(stringChoiceUser);
                if (integers.contains(choiceUser)) {
                    listOfGoods.add(map.get(choiceUser));
                    System.out.println(BUY_MENU_ONE + System.lineSeparator() + BUY_MENU);
                } else if (choiceUser == 0) {
                    mainMenu();
                } else {
                    throw new MainMenuException(EXCEPTION_ONE);
                }
            } catch (NumberFormatException e) {
                System.err.println(EXCEPTION_TWO);
            } catch (MainMenuException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private void basketMenu() {
        readFromListOfGoods();
        List<Integer> listIdOfGoods = new ArrayList<>();
        System.out.println(BASKET_MENU_ONE);
        while (true) {
            for (Goods listOfGood : listOfGoods) {
                listIdOfGoods.add(listOfGood.getIdGoods());
            }
            String stringChoiceUser = scanner.nextLine();
            try {
                int choiceUser = Integer.parseInt(stringChoiceUser);
                if (listIdOfGoods.contains(choiceUser)) {
                    listOfGoods.remove(listIdOfGoods.indexOf(choiceUser));
                    System.out.println(BASKET_MENU_TWO + System.lineSeparator() + BASKET_MENU_ONE);
                } else if (choiceUser == 0) {
                    mainMenu();
                } else {
                    throw new MainMenuException(EXCEPTION_THREE);
                }
            } catch (NumberFormatException e) {
                System.err.println(EXCEPTION_TWO);
            } catch (MainMenuException e) {
                System.err.println(e.getMessage());
            }
        }
        }

    private void orderMenu() {
        if (listOfGoods.isEmpty()){
            System.out.println(ORDER_MENU_FIVE);
            System.out.println(ORDER_MENU_FOUR);
            String stringChoiceUser = scanner.nextLine();
            if (!stringChoiceUser.isEmpty()){
                mainMenu();
            }
        }
        File file = Path.of("Recourses", "order.txt").toFile();
        DateFormat df = new SimpleDateFormat("dd MMM yyyy");
        Calendar dateOfOrder = new GregorianCalendar();
        Calendar dateOfDeliver = new GregorianCalendar();
        dateOfDeliver.add(Calendar.MONTH, 2);
        try (var fileWriter = new FileWriter(file)) {
            fileWriter.write(ORDER_MENU_ONE + df.format(dateOfOrder.getTime()) + System.lineSeparator());
            fileWriter.write(ORDER_MENU_TWO +df.format(dateOfDeliver.getTime()) + System.lineSeparator());
            for (Goods listOfGood : listOfGoods) {
                Date dateProduce = listOfGood.getDateOfProduce().getTime();
                String id = String.valueOf(listOfGood.getIdGoods());
                String name = listOfGood.getName();
                String price = String.valueOf(listOfGood.getPrice());
                String stringDateProduce = df.format(dateProduce);
                String text = "id " +id+ ":  " +name+ ", стоимость - " +price+ ", дата выпуска - " +
                        stringDateProduce;
                fileWriter.write(text);
                fileWriter.write(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(ORDER_MENU_THREE + df.format(dateOfDeliver.getTime()));
        System.out.println(ORDER_MENU_FOUR);
        String stringChoiceUser = scanner.nextLine();
        if (!stringChoiceUser.isEmpty()){
            mainMenu();
        }

    }

    private void readFromFileGoods() {
        System.out.println(READ_FROM_FILE);
        File file = Path.of("Recourses", "goods.txt").toFile();
        try(var fileReader = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {
            String text = fileReader
                    .lines()
                    .collect(Collectors.joining(System.lineSeparator()));
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readFromListOfGoods(){
        DateFormat df = new SimpleDateFormat("dd MMM yyyy");
        if (listOfGoods.isEmpty()) {
            System.out.println(READ_FROM_LIST_ONE);
        } else {
            System.out.println(READ_FROM_LIST_TWO);
            for (Goods goods : listOfGoods) {
                Date dateProduce = goods.getDateOfProduce().getTime();
                String id = String.valueOf(goods.getIdGoods());
                String name = goods.getName();
                String price = String.valueOf(goods.getPrice());
                String stringDateProduce = df.format(dateProduce);
                String text = "id " +id+ ":  " +name+ ", стоимость - " +price+ ", дата выпуска - " +
                        stringDateProduce;
                System.out.println(text + System.lineSeparator());
            }
        }
    }
}