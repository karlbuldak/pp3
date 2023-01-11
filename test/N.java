public class N {
    public String str1;
    public String str2;

    public N(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public N swap(){
        return new N(this.str2, this.str1);
    }

    public String toString(){
        return(str1+str2);
    }
}
