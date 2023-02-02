package Task4;

public class WorkWithMassiv {

    public static final String STROKA = "Вывод строки \n";
    public static final String MASSIV = "Вывод массива данных \n";

    public void Task3(String[] massivNew){
        StringBuilder stroka = new StringBuilder();
        // находим длину массива, необходимого для хранения чисел
        int count = 0;
        for (int i = 0; i < massivNew.length; i++) {
            if (massivNew[i].indexOf(".") != -1){
                count++;
            }
        }

        int j = 0;
        int[] number = new int[count];
        for (int i = 0; i < massivNew.length; i++){
            if (massivNew[i].indexOf(".") == -1) {
                stroka = stroka.append(massivNew[i].substring(2,5));
            }
            else if (Double.parseDouble(massivNew[i]) >= (double) 1.7) {
                number[j] = (int) Math.ceil(Double.parseDouble(massivNew[i]));
                j++;
            }
            else {
                number[j] = (int) Math.floor(Double.parseDouble(massivNew[i]));
                j++;
            }
        }
        System.out.print(MASSIV);
        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1){
                System.out.println(number[i]);
            }
            else {
                System.out.print(number[i] + "_");
            }
        }
        System.out.print(STROKA);
        for (int i = 0; i < stroka.length(); i++) {
            if (i == stroka.length() - 1) {
                System.out.print(stroka.charAt(i));
            }
            else {
                System.out.print(stroka.charAt(i) +",");
            }
        }
    }
}
