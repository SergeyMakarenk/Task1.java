package Task10;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Runner {

    private static final Map<Integer, Goods> map= new HashMap<>();
    Random random = new Random();

    public void start() {
        createGoods();
        writeMapToFile();
        Menu menu = new Menu();
        menu.mainMenu();
    }

        private void createGoods(){
        for (ListNamesAndPricesOfGoods value : ListNamesAndPricesOfGoods.values()) {
            int id = createId();
            Goods goods = new Goods(id, value.getName(), value.getPrice(), createDate());
            map.put(id, goods);
        }
    }

    private int createId() {
        String stringId = String.valueOf(random.nextInt(1, 10));
        stringId = stringId.concat(String.valueOf(random.nextInt(1,10)));
        stringId = stringId.concat(String.valueOf(random.nextInt(1,10)));
        return Integer.parseInt(stringId);
    }

    // Метод создает произвольную дату изготовления в диапазоне от 01 янв 2000 до 01 янв 2023

    private Calendar createDate() {
        long ms = random.nextLong(946674000000L, 1672520400000L);
        Calendar date = new GregorianCalendar();
        date.setTimeInMillis(ms);
        return date;
    }

    private void writeMapToFile(){
        File file = new File(String.join(File.separator, "Recourses", "goods.txt"));
        DateFormat df = new SimpleDateFormat("dd MMM yyyy");
        try (var fileOutputStream = new FileOutputStream(file)){
            Collection<Goods> values = map.values();
            for (Goods value : values) {
                Date dateProduce = value.getDateOfProduce().getTime();
                String id = String.valueOf(value.getIdGoods());
                String name = value.getName();
                String price = String.valueOf(value.getPrice());
                String stringDateProduce = df.format(dateProduce);
                String text = "id " +id+ ":  " +name+ ", стоимость - " +price+ ", дата выпуска - " +
                        stringDateProduce;
                fileOutputStream.write(text.getBytes(StandardCharsets.UTF_8));
                fileOutputStream.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<Integer, Goods> getMap() {
        return map;
    }
}
