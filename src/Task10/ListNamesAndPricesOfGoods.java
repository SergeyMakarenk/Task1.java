package Task10;

public enum ListNamesAndPricesOfGoods {

    GOODS0("Хлеборезка Слайсер Плюс Экстра Пуппер Шмуппер", 300),
    GOODS1("Чудо мухоловка Гроза Вижион Вилледж", 65),
    GOODS2("Плед для дивана Кавер Макс Сайз", 140),
    GOODS3("Мыльница Марси Дарси", 15),
    GOODS4("Вставная челюсть Клац Пакс Шмакс", 100),
    GOODS5("РПГ-7", 1200);

    private final String name;
    private final int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    ListNamesAndPricesOfGoods(String name, int price) {
        this.name = name;
        this.price = price;
    }

}
