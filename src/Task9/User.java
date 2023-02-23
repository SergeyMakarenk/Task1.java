package Task9;

import Task9.exceptions.AgeException;

public class User {

    private int age;
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void setAge(int age) throws AgeException {
        if (age <= 0){
            throw new AgeException("Age is wrong");
        }
        this.age = age;
    }
}
