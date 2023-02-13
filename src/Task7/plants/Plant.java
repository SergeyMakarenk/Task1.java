package Task7.plants;


import Task7.Create;

public class Plant <T> implements Create {

        private T name;

    public void create(){
        System.out.println("создаем часть робота " + name);
    }

    public Plant(T name) {
        this.name = name;
    }

    public T getName() {
        return  name;
    }

}
