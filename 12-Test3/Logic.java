public class Logic {
    public boolean[] array;

    public Logic(boolean[] array) {
        this.array = array;
    }

    public int opposite() {
        int licznik = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i]) {
                if (array[i - 1] == false & array[i + 1] == false) {
                    licznik++;
                }
            } else {
                if (array[i - 1] == true & array[i + 1] == true) {
                    licznik++;
                }
            }
        }
        return licznik;
    }
}
