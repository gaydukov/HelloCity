
import com.time.NewTimeZone;
import org.junit.Assert;
import org.junit.Test;
import java.util.TimeZone;


public class NewTimeZoneTest {

    @Test
    public void newTimeZonaCityNameTest1(){
        NewTimeZone newTimeZone=new NewTimeZone();
        Assert.assertEquals("Europe/Moscow",newTimeZone.newTimeZoneCityName("Moscow").getID());
    }
    @Test
    public void newTimeZonaCityNameTest2(){
        NewTimeZone newTimeZone=new NewTimeZone();
        Assert.assertEquals("America/New_York",newTimeZone.newTimeZoneCityName("New York").getID());
    }
    @Test
    public void newTimeZonaCityNameTest3() {
        NewTimeZone newTimeZone = new NewTimeZone();
        Assert.assertEquals(TimeZone.getTimeZone("GMT").getID(), newTimeZone.newTimeZoneCityName("Dnepr").getID());
    }
    @Test
    public void newTimeZonaOfZonaTest(){
        NewTimeZone newTimeZone=new NewTimeZone();
        Assert.assertEquals("Europe/London",newTimeZone.newTimeZoneOfZona("Europe/London").getID());
    }


}


