public class Exercises {
    static boolean isDoubloon(String s) {
        String lower = s.toLowerCase();
        int[] counts = new int[26];
        for (char letter : lower.toCharArray()) {
            int index = letter - 'a';
            counts[index]++;
        }
        for (int count : counts) {
            if (count != 0 && count != 2) {
                return false;
            }
        }
        return true;

    }

    // check if you can spell word with set of tiles in scrabble game, you can use a
    // letter only once
    static boolean canSpell(String tiles, String word) {
        int counter = 0;
        tiles = tiles.toLowerCase();
        word = word.toLowerCase();
        int[] countstiles = new int[26];
        int[] countsword = new int[26];
        for (char letter : tiles.toCharArray()) {
            int index = letter - 'a';
            countstiles[index]++;
        }
        for (char letter : word.toCharArray()) {
            int index = letter - 'a';
            countsword[index]++;
        }
        for (int i = 0; i < countstiles.length; i++) {
            if (countstiles[i] >= countsword[i]) {
                counter++;
            }
        }
        if (counter == word.length()) {
            return true;
        }
        return false;

        
    }

    static int indexOfMax(int[] array){
        int largest = 0;
        for ( int i = 1; i < array.length; i++ )
        {
            if ( array[i] > array[largest] ){
                largest = i;
            }
        }
        return largest;
      }
    static double squareRoot(double number){
        double x = 0;
        double xn = number/2;
        while(Math.abs(x - xn)>0.0001){
            x=xn;
            xn=(x+number/x)/2;
        }
        return xn;
    }
    

    public static void main(String[] args) {
        // System.out.println(isDoubloon("MaMA"));
        //System.out.println(canSpell("quijibo", "quii"));
        //System.out.println(indexOfMax(new int[] {1,2,3,4,5,90}));
        System.out.println(squareRoot(10));
}
}
