public class Student{
    //Atrybuty:
    
    String name;
    int age;
    String studentId;
    boolean isValid;
    int semesterNumber;
    double averageGrade;
    
    //Zachowania:
    
    public void sayHello(){
        System.out.println("Cześć!");
    }
    public void displayInfo(){
        System.out.println("Imie: " + name + " Numer semestru: " + semesterNumber + " Średnia " + averageGrade);
    }
    public void displayName(){
        System.out.println("Mam na imię " + name);
    }
    public void displayAge(){
        System.out.println("Mam " + age + " lat");
    }
    public void changeStatus(){
        isValid = !isValid;
    }
    public void displayStatus(){
        System.out.println("Imie: " + name + " Numer albumu: " + studentId + " Legitymacja ważna?: " + isValid);
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Karol";
        s1.age = 19;
        s1.studentId = "221451";
        s1.isValid = true;
        s1.semesterNumber = 3;
        s1.averageGrade = 4.4;
        s1.sayHello();
        s1.displayInfo();
        s1.displayName();
        s1.displayAge();
        s1.displayStatus();
        s1.changeStatus();
        s1.displayStatus();
    }
}