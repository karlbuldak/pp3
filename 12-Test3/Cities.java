public class Cities {
    public String[] array;

    public Cities(String[] array) {
        this.array = array;
    }

    public Cities filter(char litera) {
        int licznik = 0;
        int checkCounter = 0;
        for (String string : array) {
            if (string.charAt(0) == litera) {
                licznik++;
            }
        }
        String[] citiesFiltered = new String[licznik];
        for (String string : array) {
            if (string.charAt(0) == litera) {
                citiesFiltered[checkCounter] = string;
                checkCounter++;
            }
        }
        Cities filtered = new Cities(citiesFiltered);
        return filtered;
    }

    public String cities() {
        String zwrot = "";
        for (String string : array) {
            zwrot+=string;
        }
        return zwrot;
    }

    public static void main(String[] args) {
        Cities c = new Cities(new String[] {"Warszawa","Sopot","Kielce","Szczecin"});
        System.out.println(c.filter('S').cities());
    }
}
