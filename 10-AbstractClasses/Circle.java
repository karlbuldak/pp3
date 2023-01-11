public class Circle extends Shape{
    private double a;

    public double getA() {
        return a;
    }
    public void setA(float a) {
        this.a = a;
    }
    public Circle(double a){
        this.a=a;
    }
    @Override
    public double area(){
        return(Math.PI*a*a);
    }
    @Override
    public double perimeter(){
        return(2*Math.PI*a);
    }
}
