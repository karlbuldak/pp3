public class Computer {
    private String systemOperacyjny;
    private String kolorObudowy;

    public String getSystemOperacyjny() {
        return systemOperacyjny;
    }

    public void setSystemOperacyjny(String systemOperacyjny) {
        this.systemOperacyjny = systemOperacyjny;
    }

    public String getKolorObudowy() {
        return kolorObudowy;
    }

    public void setKolorObudowy(String kolorObudowy) {
        this.kolorObudowy = kolorObudowy;
    }

    private boolean isOn;
    private Processor processor;

    public void powerButton() {
        isOn = !isOn;
    }

    public float runProgramSum(float l1, float l2) {
        return processor.sumujLiczby(l1, l2);
    }

    public Computer(String systemOperacyjny, String kolorObudowy,
            boolean isOn, String nazwa, float taktowanie, int liczbaRdzeni, String socket) {
        this.kolorObudowy = kolorObudowy;
        this.isOn = isOn;
        this.processor = new Processor(nazwa, taktowanie, liczbaRdzeni, socket);
    }

    public static void main(String[] args) {
        Computer c = new Computer("windows", "żółty", false, "intel", 12, 1, "12");
        System.out.println(c.processor);
    }
}
