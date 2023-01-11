public class Person {
    public String name;
    public String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return (name.substring(0, 1).toUpperCase() + surname.substring(0, 1).toUpperCase());
    }
}