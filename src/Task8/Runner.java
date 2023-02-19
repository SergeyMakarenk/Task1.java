package Task8;


import java.util.ArrayList;

public class Runner {

    public void start(){

        Person user1 = new Person("вася");
        Person user2 = new Person("миша");
        MyList<Person> arr = new MyArrayList<>();
        System.out.println(arr.isEmpty());
        arr.add(user1);
        System.out.println(arr.size());
        arr.add(user1);
        arr.add(user1);
        System.out.println(arr.contains(user2));
        arr.add(1, user2);
        System.out.println(arr.toString());
        arr.remove(user2);
        System.out.println(arr.toString());
        MyList<Person> arr1 = new MyArrayList<>();
        arr1.add(user2);
        arr1.add(user2);
        System.out.println(arr1.toString());
        arr.addAll(arr1);
        System.out.println(arr);
        System.out.println(arr.get(2));
        System.out.println(arr1.remove(0));
        System.out.println(arr.set(0, user2));
        System.out.println(arr.indexOf(user1));
        System.out.println(arr.toString());
    }
}
