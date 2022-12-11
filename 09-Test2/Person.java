public class Person {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    public int getAge() {
        return age;
    }
}
