public class Processor{
    private String nazwa;
    private float taktowanie;
    private int liczbaRdzeni;
    private String socket;

    public float sumujLiczby(float l1, float l2){
        return(l1+l2);
    }

    public float dzielLiczby(float l1, float l2){
        return(l1/l2);
    }

    public float mnozLiczby(float l1, float l2){
        return(l1*l2);
    }

    public float odejmijLiczby(float l1, float l2){
        return(l1-l2);
    }

    public Processor(String nazwa, float taktowanie, int liczbaRdzeni, String socket){
        this.nazwa = nazwa;
        this.taktowanie = taktowanie;
        this.liczbaRdzeni = liczbaRdzeni;
        this.socket = socket;
    }
}