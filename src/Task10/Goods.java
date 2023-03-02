package Task10;

import java.util.Calendar;

public class Goods {

    private final int idGoods;
    private final String name;
    private final int price;
    private final Calendar dateOfProduce;

    public Goods(int idGoods, String name, int price, Calendar dateOfProduce) {
        this.idGoods = idGoods;
        this.name = name;
        this.price = price;
        this.dateOfProduce = dateOfProduce;
    }

    public int getIdGoods() {
        return idGoods;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Calendar getDateOfProduce() {
        return dateOfProduce;
    }
}
