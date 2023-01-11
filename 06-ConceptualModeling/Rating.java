import java.util.Arrays;
public class Rating {
    private int score1;
    private int score2;
    private int score3;
    private int score4;
    private int score5;

    public Rating(int score1,int score2,int score3,int score4,int score5){
        
        this.score1=score1;
        this.score2=score2;
        this.score3=score3;
        this.score4=score4;
        this.score5=score5;
    }

    public int finalResult(){
        int finalresult=0;
        int[] scores = new int[5];
        scores[0]=score1;
        scores[2]=score3;
        scores[1]=score2;
        scores[3]=score4;
        scores[4]=score5;
        Arrays.sort(scores);
        scores[0]=0;
        scores[4]=0;
        for (int i : scores) {
            finalresult+=i;
        }
        return finalresult/scores.length;
    }
}
