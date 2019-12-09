package ArrayListFilter;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filteration {
    public static void main(String[] args) {

        ArrayList<Person> arrayList = new ArrayList<Person>(){};
        Person p1= new Person("Yogesh", 35, "Male");
        Person p2= new Person("Rajesh", 25, "Male");
        Person p3= new Person("Shwati", 29, "Female");
        Person p4= new Person("Yogesh", 35, "Male");
        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        arrayList.add(p4);

        Predicate<Person> filter= arrayList1->arrayList1.getAge() == 35;

        ArrayList<Person> result =(ArrayList<Person>) arrayList.stream().filter(filter)
                .collect(Collectors.toList());

        System.out.println(result.get(0).age);

    }
}
