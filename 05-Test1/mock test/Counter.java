public class Counter {
    int counter = 0;
    void increase(){
        this.counter++;
    }
    void increase(int a){
        this.counter+=a;
    }
    void decrease(){
        this.counter--;
    }
    void decrease(int a){
        this.counter-=a;
    }
    int value(){
        return counter;
    }
    public static void main(String[] args) {
        Counter c = new Counter();
        System.out.println(c.value());
        c.increase(); 
        c.increase();
        c.decrease();
        c.increase(5); 
        c.decrease(2);
        System.out.println(c.value());
    }
}
