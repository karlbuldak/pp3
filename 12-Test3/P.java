public class P {
    public static String m(int n){
        String str="";
        int hundreds=0;
        int tens=0;
        int ones=0;
        hundreds=(n-n%100)/100;
        n=n-hundreds*100;
        tens=(n-n%10)/10;
        n=n-tens*10;
        ones=n;
        for (int i = 0; i < hundreds; i++) {
            str+="*";
        }
        for (int i = 0; i < tens; i++) {
            str+="+";
        }
        for (int i = 0; i < ones; i++) {
            str+="/";
        }
        return str;
    }
}
