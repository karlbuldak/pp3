public class Numbers {

    private int l1,l2,l3,l4,l5;

    public Numbers(int l1, int l2, int l3, int l4, int l5){
        this.l1 = l1;
        this.l2 = l2;
        this.l3= l3;
        this.l4= l4;
        this.l5= l5;
    }

    public boolean different(){
        int[] liczby = {this.l1,this.l2,this.l3,this.l4,this.l5};
        for(int i=0; i<liczby.length-1; i++){
            for(int j=i+1; j<liczby.length; j++){
                if(liczby[i]==liczby[j]){
                    return false;
                }                
            }
            }
        return true;
    }
    public static void main(String[] args) {
        Numbers n = new Numbers(9, 7, 24, 3, 7);
        System.out.println(n.different());
    }
    
}
