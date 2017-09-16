import com.time.Message;
import com.time.NewTimeZone;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import static java.util.TimeZone.getTimeZone;

/**
 * Created by Маша on 12.09.2017.
 */
public class NewTimeZoneTest {
    @Test
    public void ntzCityNameTest1(){
        NewTimeZone ntz=new NewTimeZone();
        Assert.assertEquals(false,ntz.ntzCityName("Kiev"));
    }
    @Test
    public void ntzCityNameTest2(){
        NewTimeZone ntz=new NewTimeZone();
        Assert.assertEquals(true,ntz.ntzCityName("Lviv"));
    }
    @Test
    public void ntzCityNameTest3(){
        NewTimeZone ntz=new NewTimeZone();
        TimeZone tz=null;
        ntz.ntzCityName("Moscow");
        Assert.assertEquals("Europe/Moscow",tz.getDefault().getID());
    }
    @Test
    public void ntzCityNameTest4(){
        NewTimeZone ntz=new NewTimeZone();
        TimeZone tz=null;
        ntz.ntzCityName("New York");
        Assert.assertEquals("America/New_York",tz.getDefault().getID());
    }
    @Test
    public void ntzGMTTest(){
        NewTimeZone ntz=new NewTimeZone();
        TimeZone tz=null;
        ntz.ntzGMT("+3");
        Assert.assertEquals("GMT+03:00",tz.getDefault().getID());
    }


}


