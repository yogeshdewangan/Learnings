package ArrayListFilter;

public class Person {
    public String getName() {
        return name;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        Gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String name;
    public int age;
    public String Gender;



}
