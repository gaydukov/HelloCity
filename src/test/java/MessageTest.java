import com.time.Message;
import org.junit.Assert;
import org.junit.Test;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MessageTest {
    @Test
    public void printMessageTest_ru() {
        Message mes = new Message();
        Locale.setDefault(new Locale("ru"));
        for (int hour=0;hour<=24;hour++) {
            if ((hour < 6) || (hour >= 23))
                Assert.assertEquals("Доброй ночи,Kiev!" + "\n", mes.printMessage("Kiev",hour));
            else if (hour < 9)
                Assert.assertEquals("Доброе утро,Kiev!" + "\n", mes.printMessage("Kiev",hour));
            else if (hour < 19)
                Assert.assertEquals("Добрый день,Kiev!" + "\n", mes.printMessage("Kiev",hour));
            else
                Assert.assertEquals("Добрый вечер,Kiev!" + "\n", mes.printMessage("Kiev",hour));
        }
    }

    @Test
    public void printMessageTest_ua() {
        Message mes = new Message();
        Locale.setDefault(new Locale("ua"));
        for (int hour=0;hour<=24;hour++) {
            if ((hour < 6) || (hour >= 23))
                Assert.assertEquals("Доброї ночі,Kiev!" + "\n", mes.printMessage("Kiev", hour));
            else if (hour < 9)
                Assert.assertEquals("Добрий ранок,Kiev!" + "\n", mes.printMessage("Kiev", hour));
            else if (hour < 19)
                Assert.assertEquals("Доброго дня,Kiev!" + "\n", mes.printMessage("Kiev", hour));
            else
                Assert.assertEquals("Добрий вечір,Kiev!" + "\n", mes.printMessage("Kiev", hour));
        }
    }

    @Test
    public void printMessageTest() {
        Locale.setDefault(new Locale("fr"));
        englishLocal();
    }

    @Test
    public void printMessageTest_en() {
        Locale.setDefault(new Locale("en"));
        englishLocal();
    }

    private static void englishLocal(){
        Message mes = new Message();
        for (int hour=0;hour<=24;hour++) {
            if ((hour < 6) || (hour >= 23))
                Assert.assertEquals("Good night,Kiev!" + "\n", mes.printMessage("Kiev", hour));
            else if (hour < 9)
                Assert.assertEquals("Good morning,Kiev!" + "\n", mes.printMessage("Kiev", hour));
            else if (hour < 19)
                Assert.assertEquals("Good afternoon,Kiev!" + "\n", mes.printMessage("Kiev", hour));
            else
                Assert.assertEquals("Good evening,Kiev!" + "\n", mes.printMessage("Kiev", hour));
        }
    }
}