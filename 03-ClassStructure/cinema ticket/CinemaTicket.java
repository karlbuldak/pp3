class CinemaTicket{
    static String cinemaName = "Multikino";
    String film;
    int row;
    String seat;
    double price;
    
    public void displayTicketInfo(){
        System.out.println("Nazwa kina: " + cinemaName + ", nazwa filmu: " + film + ", rząd: " + row + ", numer fotelu: " + seat + ", cena: " + price + " PLN.");
    }
    
    public double calculatePrice(){
        if (row!=1 || row!=2){
            price = 25;
        } else {
            price = 10;
        }
        return price;
    }
    
    public CinemaTicket(String f, int r, String s){
        film=f;
        row=r;
        seat=s;
        price=calculatePrice();
    }
    
    public static void main(String[] args){
        CinemaTicket ct1 = new CinemaTicket("Gladiator", 1, "10");
        CinemaTicket ct2 = new CinemaTicket("Gladiator", 7, "10");
    }
}