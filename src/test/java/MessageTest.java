import com.time.Message;
import org.junit.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by Маша on 14.09.2017.
 */
public class MessageTest {
    @Test
    public void printMessageTest_ru() {
        Message mes = new Message();
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("HH");
        Locale.setDefault(new Locale("ru"));
        int hour = Integer.parseInt(dateFormat.format(calendar.getTime()));
        if (hour < 6)
            Assert.assertEquals("Доброй ночи,Kiev!" + "\n", mes.printMessage("Kiev"));
        else if (hour < 9)
            Assert.assertEquals("Доброе утро,Kiev!" + "\n", mes.printMessage("Kiev"));
        else if (hour < 19)
            Assert.assertEquals("Добрый день,Kiev!" + "\n", mes.printMessage("Kiev"));
        else
            Assert.assertEquals("Добрый вечер,Kiev!" + "\n", mes.printMessage("Kiev"));

    }

    @Test
    public void printMessageTest_en() {
        Message mes = new Message();
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("HH");
        Locale.setDefault(new Locale("en"));
        int hour = Integer.parseInt(dateFormat.format(calendar.getTime()));
        if (hour < 6)
            Assert.assertEquals("Good night,Kiev!" + "\n", mes.printMessage("Kiev"));
        else if (hour < 9)
            Assert.assertEquals("Good morning,Kiev!" + "\n", mes.printMessage("Kiev"));
        else if (hour < 19)
            Assert.assertEquals("Good afternoon,Kiev!" + "\n", mes.printMessage("Kiev"));
        else
            Assert.assertEquals("Good evening,Kiev!" + "\n", mes.printMessage("Kiev"));

    }

    @Test
    public void printMessageTest_ua() {
        Message mes = new Message();
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("HH");
        Locale.setDefault(new Locale("ua"));
        int hour = Integer.parseInt(dateFormat.format(calendar.getTime()));
        if (hour < 6)
            Assert.assertEquals("Доброї ночі,Kiev!" + "\n", mes.printMessage("Kiev"));
        else if (hour < 9)
            Assert.assertEquals("Доброго ранку,Kiev!" + "\n", mes.printMessage("Kiev"));
        else if (hour < 19)
            Assert.assertEquals("Доброго дня,Kiev!" + "\n", mes.printMessage("Kiev"));
        else
            Assert.assertEquals("Добрий вечір,Kiev!" + "\n", mes.printMessage("Kiev"));

    }

    @Test
    public void printMessageTest() {
        Message mes = new Message();
        DateFormat dateFormat = new SimpleDateFormat("HH");
        Date dataNewZone = new Date();
        Locale.setDefault(new Locale("fr"));
        int hour = Integer.parseInt(dateFormat.format(dataNewZone));
        if (hour < 6)
            Assert.assertEquals("Good night,Kiev!" + "\n", mes.printMessage("Kiev"));
        else if (hour < 9)
            Assert.assertEquals("Good morning,Kiev!" + "\n", mes.printMessage("Kiev"));
        else if (hour < 19)
            Assert.assertEquals("Good afternoon,Kiev!" + "\n", mes.printMessage("Kiev"));
        else
            Assert.assertEquals("Good evening,Kiev!" + "\n", mes.printMessage("Kiev"));
    }
}