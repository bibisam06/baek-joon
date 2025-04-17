
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        List<Person> personList = new ArrayList<Person>();
        for (int i = 0; i < input; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            personList.add(new Person(name, age));
        }

        personList.sort((p1, p2) -> {
            return Integer.compare(p1.age, p2.age);
        });

        for(Person p : personList){
            System.out.println(p.age + " " + p.name);
        }
    }
    }

class Person {
    public String name;
    public int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //getter, setter
}