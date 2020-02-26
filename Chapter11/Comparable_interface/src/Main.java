import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(13);
        integerList.add(2);
        integerList.add(3);
        integerList.add(11);
        integerList.add(5);
        integerList.add(17);

        Collections.sort(integerList);
        System.out.println(integerList);

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Young");
        stringList.add("John");
        stringList.add("Grace");
        stringList.add("Andrew");
        stringList.add("Michael");

        Collections.sort(stringList);
        System.out.println(stringList);

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Charlie", 25));
        personList.add(new Person("Ben", 35));
        personList.add(new Person("Alex", 32));
        personList.add(new Person("Daniel", 41));

        Collections.sort(personList);
        System.out.println(personList);
    }
}
