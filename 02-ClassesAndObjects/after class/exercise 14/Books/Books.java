public class Books{
    //atrybuty
    String tytul;
    String autor;
    int numerStrony = 1;
    //zachowania
    public void przewrocStrone(){
        numerStrony ++;
    }
    public void pokazNumerStrony(){
        System.out.println("Numer strony: " + numerStrony);
    }
    public static void main(String[] args){
        Books b1 = new Books();
        b1.tytul = "W pustyni i w puszczy";
        b1.autor = "Henryk Sienkiewicz";
        Books b2 = new Books();
        b2.tytul = "Krzyżacy";
        b2.autor = "Henryk Sienkiewicz";
        b1.pokazNumerStrony();
        b1.przewrocStrone();
        b1.przewrocStrone();
        b1.przewrocStrone();
        b1.pokazNumerStrony();
        b2.pokazNumerStrony();
        b2.przewrocStrone();
        b2.przewrocStrone();
        b2.przewrocStrone();
        b2.przewrocStrone();
        b2.przewrocStrone();
        b2.przewrocStrone();
        b2.pokazNumerStrony();
    }
}