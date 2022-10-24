public class Smartphone{
    //atrybuty
    String producent;
    String model;
    String rokProdukcji;
    boolean dziala;
    int kodOdblokowania;
    //zachowania
    public void zadzwonDoMamy(){
        System.out.println("Dzwonie do mamy... ");
    }
    public void zadzwonDoTaty(){
        System.out.println("Dzwonie do taty... ");
    }
    public void wyswietlInfo(){
        System.out.println("Informacje o telefonie: Producent- " + producent + " Model- " + model + " Rok produkcji- " + rokProdukcji + " Działa- " + dziala);
    }
}