public class SMS extends Message{
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public SMS(String text, String number){
        super(text);
        this.number=number;
    }

    public void send(){
        System.out.println("Treść wiadomości: "+getText()+", Liczba znaków: "+charNumber()+", Numer odbiorcy: "+getNumber());
    }

    public static void main(String[] args) {
        SMS s = new SMS("Hello World", "5825845632");
        s.setText("ABBA");
        s.send();

    }
}
