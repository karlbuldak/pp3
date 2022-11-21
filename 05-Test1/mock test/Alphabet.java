public class Alphabet {
    static boolean isAlphabet(String t) {
        int n = t.length();
        boolean sorted = true;
        for (int i = 1; i < n - 1; i++) {
            if (t.charAt(i) >= t.charAt(i + 1)) {
                sorted = false;
            }
        }   
        return sorted;
    }

    public static void main(String[] args) {
        System.out.println(Alphabet.isAlphabet("abegsw"));
        System.out.println(Alphabet.isAlphabet("abcmhsw"));
    }
}
