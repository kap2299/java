package dateAndTime;
import java.time.*;

public class JodaDateTime {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        //System.out.println(date);

        int dte= date.getDayOfMonth();
        int mont= date.getMonthValue();
        int yr= date.getYear();

        System.out.println(dte+"/"+mont+"/"+yr);

        LocalTime time = LocalTime.now();
        //System.out.println(time);
        int hr= time.getHour();
        int min= time.getMinute();
        int sec= time.getSecond();
        int nano= time.getNano();
        System.out.println(hr+":"+min+":"+sec+":"+nano);
    }
}