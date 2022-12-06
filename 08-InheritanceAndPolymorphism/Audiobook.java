public class Audiobook extends Book {
    protected int minutes;
    protected int seconds;

    public Audiobook(String author, String title, int minutes, int seconds){
        super(author, title);
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    
    public void display(){
        System.out.println("author: " +author+" title:"+ title+" minutes: "+minutes+" seconds: "+seconds);
    }
}
