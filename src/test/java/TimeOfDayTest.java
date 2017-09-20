import com.time.TimeOfDay;
import org.junit.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class TimeOfDayTest {
    @Test
    public void timeHourCityNameTest(){
        TimeOfDay timeOfDay=new TimeOfDay();
        DateFormat dateFormat = new SimpleDateFormat("HH");
        Calendar calendar = Calendar.getInstance();
        int hour = Integer.parseInt(dateFormat.format(calendar.getTime()));
        Assert.assertEquals(hour,timeOfDay.timeHourCityName("Kiev"));
    }
    @Test
    public void timeHourZonaTest(){
        TimeOfDay timeOfDay=new TimeOfDay();
        DateFormat dateFormat = new SimpleDateFormat("HH");
        Calendar calendar = Calendar.getInstance();
        int hour = Integer.parseInt(dateFormat.format(calendar.getTime()));
        Assert.assertEquals(hour,timeOfDay.timeHourZona("Europe/Kiev"));
    }

}
