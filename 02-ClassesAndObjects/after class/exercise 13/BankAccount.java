public class BankAccount{
    //atrybuty
    String numerKonta;
    String wlasciciel;
    int iloscSrodkow;
    String nazwaBanku;
    String haslo;
    //zachowania
    public void wplacPieniadze(int kwota){
        iloscSrodkow += kwota;
        System.out.println("Wpłacono " + kwota + " PLN, ilość środków na koncie: " + iloscSrodkow);
    }
    public void resetujHaslo(){
        haslo = "";
    }
    public void pokazInfo(){
        System.out.println("Numer konta: " + numerKonta);
    }
}