package Task7.Anums;

public enum NameOfBodies {

    BIG("Большое"),
    MIDDLE("Среднее"),
    SMALL("Маленькое");

    String translation;

    NameOfBodies(String translation) {
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
