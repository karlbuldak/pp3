
/**
 * Write a description of class Date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Date
{
    String day = "Saturday";
    String date = "15";
    String month = "October";
    String year = "2022";
    
    /**
     * Constructor for objects of class Date
     */
    public Date()
    {
     System.out.println("American format: " + day + ", " + month + date + ", " + year);
     System.out.println("European format: " + day + date + month + year);
    }
}
