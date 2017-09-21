import com.time.TimeOfDay;
import org.junit.Assert;
import org.junit.Test;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;


public class TimeOfDayTest {
    @Test
    public void timeHourCityNameTest(){
        TimeOfDay timeOfDay=new TimeOfDay();
        DateFormat dateFormat = new SimpleDateFormat("HH");
        dateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Kiev"));
        Date date=new Date();
        int hour = Integer.parseInt(dateFormat.format(date.getTime()));
        Assert.assertEquals(hour,timeOfDay.timeHourCityName("Kiev"));
    }
    @Test
    public void timeHourZonaTest(){
        TimeOfDay timeOfDay=new TimeOfDay();
        DateFormat dateFormat = new SimpleDateFormat("HH");
        dateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Kiev"));
        Date date=new Date();
        int hour = Integer.parseInt(dateFormat.format(date.getTime()));
        Assert.assertEquals(hour,timeOfDay.timeHourZona("Europe/Kiev"));
    }

}
