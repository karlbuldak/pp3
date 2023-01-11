public class Pizza extends Food implements Extra {
    public int size;

    public Pizza(String name, int size){
        super(name);
        this.size=size;
    }

    @Override
    public void setPrice(float price) {
        price=this.size-10;
    }

    @Override
    public float discount() {
        if (this.getPrice()>=30) {
            return 0.05f;
        }else{
            return 0;
        }
    }

    @Override
    public float delivery() {
        if (this.size>=50) {
            return 8;
        }else{
            return 6;
        }
    }
    @Override
    public float delivery(int tip) {
        if (this.size>=50) {
            return 8+tip;
        }else{
            return 6+tip;
        }
    }
}

