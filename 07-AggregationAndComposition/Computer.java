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

    public Computer(Processor processor, String systemOperacyjny, String kolorObudowy, boolean isOn){
        this.processor=processor;
        this.kolorObudowy = kolorObudowy;
        this.isOn = isOn;
    }

    public static void main(String[] args) {
        Processor p = new Processor(null, 0, 0, null);
        Computer c = new Computer(p,"windows", "żółty", false);
        
    }
}
