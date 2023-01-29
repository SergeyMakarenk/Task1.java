package Task3;

public class Cat {

    /* переменные для первой задачи (цикла) */

    String nameCat = "Мурка";
    int ageCate = 1;

    /* Переменные для второй и третьей задачи (цикла) */

    private String geNameCat;
    private int geAgeCat;


    /* Метод toString для вывода данных объекта класса Cat */

    @Override
    public String toString() {
        return "Cat{" +
                "geNameCat='" + geNameCat + '\'' +
                ", geAgeCat=" + geAgeCat +
                '}';
    }

    /* методы для Task2 */

    public String getGeNameCat() {
        return geNameCat;
    }

    public void setGeNameCat(String geNameCat) {
        this.geNameCat = geNameCat;
    }

    public int getGeAgeCat() {
        return geAgeCat;
    }

    public void setGeAgeCat(int geAgeCat) {
        this.geAgeCat = geAgeCat;
    }

    /* конструктор для Task3 */

    public Cat() {
    }

    public Cat(String geNameCat, int geAgeCat) {
        this.geNameCat = geNameCat;
        this.geAgeCat = geAgeCat;
    }



}


