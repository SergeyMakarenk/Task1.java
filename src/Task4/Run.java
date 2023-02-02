package Task4;

public class Run {

    public static final String CREATE = "Вывод созданной матрицы";
    public static final String DIAGONAL_PRIAM = "Вывод массива прямой диагонали";
    public static final String DIAGONAL_OBR = "Вывод массива обратной диагонали";
    public static final String EQUELLS = "Проверяем равенство массивов диагоналей";

    public void start(){
        Matrica classMatric = new Matrica();
        classMatric.matricaCreate();
        System.out.println(CREATE);
        classMatric.matricaOutput();
        System.out.println(DIAGONAL_PRIAM);
        classMatric.diagonalPryamaya();
        System.out.println(DIAGONAL_OBR);
        classMatric.diagonalObratnaya();
        System.out.println(EQUELLS);
        classMatric.equells();
        WorkWithMassiv classWorkWithMassiv = new WorkWithMassiv();
        classWorkWithMassiv.Task3(classMatric.massivNew());
    }
}
