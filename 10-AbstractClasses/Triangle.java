public class Triangle extends Shape{
    private float a;
    private float b;
    private float c;

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public Triangle(float a, float b){
        this.a=a;
        this.b=b;
    }

    public float getA() {
        return a;
    }
    public void setA(float a) {
        this.a = a;
    }
    public float getB() {
        return b;
    }
    public void setB(float b) {
        this.b = b;
    }

    @Override
    public double area(){
        double p = (a+b+c)*0.5;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double perimeter(){
        return(a+b+c);
    }

}
