public class SuperCounter extends Counter {
    
    public SuperCounter(int n) {
        super(n);
    }

    public void addN(int n) {
        int i = 0;
        while (i<n){
            add1();
            i++;
        }
    }

    public static void main(String[] args) {
        SuperCounter sc = new SuperCounter(3);
        sc.addN(12);
        sc.addN(2);
        System.out.println(sc.getCounter());
    }
}
