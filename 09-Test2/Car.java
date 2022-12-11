public class Car extends Vehicle {
    private int maxSpeed;

    public Car(int seats, int maxSpeed){
        super(seats);
        this.maxSpeed=maxSpeed;
    }
    public int[] spec(){
        int[] array = {1,1};
        array[0]=this.getSeats();
        array[1]=maxSpeed;
        return array;
    }
    public static void main(String[] args) {
        Car c = new Car(2, 100);
        int[] a=c.spec();
        for (int i : a) {
            System.out.println(i);    
        }
        
    }

}
