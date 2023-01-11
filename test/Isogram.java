public class Isogram {
    static boolean isogram(String string) {
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (string.indexOf(c) != string.lastIndexOf(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isogram("BLUE water"));

    }
}
