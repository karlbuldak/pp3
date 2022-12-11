// create class Counter in a separate file
public class Counter {
    protected int counter;

    Counter(int c) {
        counter = c;
    }

    public void add1() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
