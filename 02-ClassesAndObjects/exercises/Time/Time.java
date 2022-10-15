
/**
 * Write a description of class Time here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Time
{
    /**
     * Constructor for objects of class Time
     */
    public static void main(String[] args){
        float hour = 13;
        float minute = 50;
        float second = 20;
        float secondsSinceMidnight = hour * 3600 + minute * 60 + second;
        float percentageOfDay = secondsSinceMidnight/86400;
        float timeAtStart = 49220;
        float timeSpent = secondsSinceMidnight-timeAtStart;
        System.out.println("Time passed since midnight in seconds is: " + secondsSinceMidnight);
        System.out.println("Percentage of day passed: " + percentageOfDay);
        System.out.println("Time spent on this exercies in seconds: " + timeSpent);
    }
}

