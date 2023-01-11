public class Numbers implements Ok {
    public int[] array;

    public Numbers(int[] array) {
        this.array = array;
    }

    public boolean ok() {
        int licznik = 0;
        for (int j = 0; j < array.length; j++) {
            if (j % 2 == 0 & array[j] % 2 == 0) {
                licznik++;
            }
            if (j % 2 == 1 & array[j] % 2 == 1) {
                licznik++;
            }
        }
        return licznik == array.length;
    }

    public static void main(String[] args) {
        Numbers n = new Numbers(new int[] { 2, 5, 2, 7, 4 });
        System.out.println(n.ok());
    }
}