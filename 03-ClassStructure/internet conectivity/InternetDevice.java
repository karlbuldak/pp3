public class InternetDevice{
    String name;
    boolean connected;
    static int connectedDevices=0;
    public InternetDevice(String name){
        this.name = name;
    }
    public void connect(){
        if(connected==false){
            connected = true;
            connectedDevices++;}
    }
    public void disconnect(){
        if(connected==true){
            connected = false;
            connectedDevices--;}
    }
    public void isConnected(){
        System.out.println(connected);
    }
    public void displayStatus(){
        System.out.println("Device name: "+name+". Is connected: "+connected);
    }
    public static void displayConnections(){
        System.out.println("Number of connections: "+connectedDevices);
    }
    public static void main(String[] args){
        InternetDevice id1 = new InternetDevice("PC");
        id1.connect();
        id1.connect();
        id1.displayStatus();
        InternetDevice id2 = new InternetDevice("laptop");
        id2.connect();
        id2.displayStatus();
        InternetDevice id3 = new InternetDevice("tablet");
        id3.connect();
        id3.displayStatus();
        InternetDevice id4 = new InternetDevice("smartphone");
        id4.disconnect();
        id4.displayStatus();
        InternetDevice id5 = new InternetDevice("TV");
        id5.disconnect();
        id5.displayStatus();
        displayConnections();
    }
}