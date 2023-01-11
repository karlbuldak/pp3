public class E{
    public String name;
    public String surname;
    public int age;
    public int time;

    public E(String name, String surname, int age, int time) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.time = time;
    }

    public String toString(){
        String str="";
        if (age>=18) {
            str+=surname.toUpperCase() + name.substring(0,1).toUpperCase() + time ;
        }else{
            str+=surname.toLowerCase()+name.substring(0,1).toLowerCase()+time;
        }
        return str;
    }
}