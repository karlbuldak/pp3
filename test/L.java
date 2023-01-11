public class L {
    public B[] array;

    public L(B[] array) {
        this.array = array;
    }
    public int m(){
        int counter=0;
        for (int i = 1; i < array.length-1; i++) {
            if(array[i].getB()){
                if(array[i-1].getB()==false&array[i+1].getB()==false){
                    counter++;
                }
            }else{
                if(array[i-1].getB()==true&array[i+1].getB()==true){
                    counter++;
                }
            }
        }
        return counter;
    }
}
