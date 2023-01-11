public class Main {
    public static void main(String[] args) {
        TV t = new TV();
        t.on();
        t.displayStatus();
        t.setChannel(15);
        t.setVolume(7);
        t.displayStatus();
        t.setVolume(10);
        t.volumeUp();
        t.displayStatus();
        t.displayStations();
    }
}
