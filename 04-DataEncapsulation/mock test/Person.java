class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void setName(String name) {
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    boolean isAdult() {
        if (this.age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return (this.name + "," + this.age);
    }

    public static void main(String[] args) {
        Person p = new Person("aNNA", 21);
        System.out.println(p.getAge());
        System.out.println(p.isAdult());
        p.setAge(17);
        System.out.println(p.isAdult());
        System.out.println(p);
    }
}
