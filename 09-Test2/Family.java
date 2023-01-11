public class Family {
    Person[] person;

    public Family(Person[] args) {
        this.person = args;
    }

    public int adults(){
        int licznik = 0;
        for(int i=0; i<person.length; i++){
            if(person[i].getAge()>=18){
                licznik++;
            }
        }
        return licznik;
    }

    public static void main(String[] args) {
        Person p1 = new Person(null, 0);
        Person p2 = new Person(null, 230);
        Person p3 = new Person(null, 120);
        Person p4 = new Person(null, 10);
        Family f1 = new Family(new Person[] {p1,p2,p3,p4});
        f1.adults();
    }
}
