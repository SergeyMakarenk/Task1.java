package Task4;

import java.util.Arrays;
import java.util.Random;

public class Matrica {

    private static final String MASSIV_NEW= "Вывод объединенного массива \n";
    private static final char ALHABET[] = {'q','w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's',
                                          'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
    private String[][] matrica = new String[10][10];
    public String[] diagonalPryam = new String[10];
    private String[] diagonalObr = new String[10];
    private String[] result = new String[20];

    public String[][] matricaCreate(){
        String[] array = new String[100];
        for (int i = 1; i <= 100; i++) {
            if (i%3 == 0){
                array[i-1] = proizvolnoeChislo();
            }
            else {
                array[i-1] = proizvolnayaStroka();
            }
        }
        int iteral = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrica[i][j] = array[iteral];
                iteral++;
            }
        }
        return matrica;
    }

    public void matricaOutput(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrica[i][j]+" ");
            }
            System.out.println();
        }
    }

    public String[] diagonalPryamaya(){
        int iteralPryam = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == (9 -j)){
                    diagonalPryam[iteralPryam] = matrica[i][j];
                    iteralPryam++;
                }
            }
        }
        System.out.println(Arrays.toString(diagonalPryam));
        return diagonalPryam;
    }

    public String[] diagonalObratnaya(){
        int iteralObr = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j){
                    diagonalObr[iteralObr] = matrica[i][j];
                    iteralObr++;
                }
            }
        }
        System.out.println(Arrays.toString(diagonalObr));
        return diagonalObr;
    }

    public void equells(){
        boolean isEquells = Arrays.equals(diagonalPryam,diagonalObr);
        if (isEquells){
            System.out.println("Диагонали равны");
        }
        else {
            System.out.println("Диагонали разные");
        }
    }

    public String[] massivNew(){
        System.arraycopy(diagonalPryam, 0, result, 0, 10);
        System.arraycopy(diagonalObr, 0, result, 10, 10);
        System.out.println(MASSIV_NEW +Arrays.toString(result));
        return result;
    }

        private String proizvolnoeChislo(){
            Random random = new Random();
            String chisloInput = String.valueOf(random.nextDouble()+1);
            String chislo = chisloInput.substring(0,7);
        return chislo;
    }

    private String proizvolnayaStroka(){
        char[] array = ALHABET;
        Random random = new Random();
        char[] stroka = new char[7];
        for (int i = 0; i < 7; i++) {
            stroka[i] = array[random.nextInt(array.length)];
            if (random.nextInt(2) == 1){
                stroka[i] = Character.toUpperCase(stroka[i]);
            }
        }
        return String.valueOf(stroka);
    }
}
