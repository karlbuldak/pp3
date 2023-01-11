public class C {
    public int[] months;

    public C(int[] months) {
        this.months = months;
    }

    public boolean m(){
        int max=0;
        for (int i : months) {
            if (i>=max) {
                max=i;
            }else{
                return false;
            }
        }
        return true;
    }
}
