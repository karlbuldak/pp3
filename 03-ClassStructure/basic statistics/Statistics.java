public class Statistics {
    public static int NumberOfItems(int start, int end){
        int count=0;
        for(int i=start;i<=end;i++){
            count++;
        }
        return count;
    }
    public static int SumOfNumbers(int start, int end){
        int count=0;
        for(int i=start;i<=end;i++){
            count+=i;
        }
        return count;
    }
    public static double MeanOfNumbers(int start, int end){
        int count=0;
        int count2=0;
        for(int i=start;i<=end;i++){
            count+=i;
        }
            for(int i=start;i<=end;i++){
            count2++;
        }
        return count/count2;
    }
    public static void main(String[] args){
        System.out.println(NumberOfItems(5,10));
        System.out.println(SumOfNumbers(5,10));
        System.out.println(MeanOfNumbers(5,10));
    }
}

