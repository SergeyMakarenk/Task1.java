package Task7.Anums;

public enum NameOfHeads {

    CIRCLE("Круглая"),
    TRIANGLE("Треугольная"),
    SQUARE("Квадратная");


    String translation;

    NameOfHeads(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
