public class Computer {
    private String systemOperacyjny;
    private String kolorObudowy;
    private boolean isOn;
    private Processor processor;

    public void powerButton(){
        isOn=!isOn;
    }

    public float runProgramSum(float l1, float l2){
        return processor.sumujLiczby(l1,l2);
    }

    public Computer(String systemOperacyjny, String kolorObudowy, boolean isOn){
        Processor p = new Processor("Intel i3", 2.5, 8, "a23b");
        this.kolorObudowy = kolorObudowy;
        this.isOn = isOn
    }

    public static void main(String[] args) {
        Computer c = new Computer("windows", "żółty", false)
        c = null;
    }
}
