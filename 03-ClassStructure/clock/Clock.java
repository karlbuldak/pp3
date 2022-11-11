public class Clock{
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;
    Clock(){
        hour = 0;
        minute = 0;
    }
    Clock(int hour,int minute){
        this.hour = hour;
        this.minute = minute;
    }
    void setClock(int hour, int minute){
        this.minute = minute;
        this.hour = hour;
    }
    void displayTime(){
        System.out.println(hour + ":" + minute);
    }
    void addOneMinute(){
        if(minute!=59){
            minute++;
        }else{
            minute=0; 
                if(hour!=23){
                    hour++;
                }else{
                    hour=0;}}
        runAlarm();
    }
    void setAlarm(int hour, int minute){
        this.alarmHour = hour;
        this.alarmMinute = minute;
    }
    public void runAlarm(){
        if(alarmHour==hour && alarmMinute==minute){
            System.out.println("beep-beep-beep-beep!!");
        }
    }
    public static void main(String[] args){
        Clock c1 = new Clock(12,47);
        c1.setAlarm(23,58);
        c1.displayTime();
        c1.setClock(18,14);
        c1.displayTime();
        c1.setClock(9,3);
        c1.displayTime();
        c1.setClock(23,58);
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
    }
}