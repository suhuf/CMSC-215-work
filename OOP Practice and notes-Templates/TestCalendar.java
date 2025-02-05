
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class TestCalendar {


    public static void main(String[] args){

        Calendar calendar = new GregorianCalendar();

        System.out.println("Current time is " + new Date());

        System.out.println("YEAR:\t" + calendar.get(Calendar.YEAR));
        System.out.println("MONTH:\t" + calendar.get(Calendar.MONTH));
        System.out.println("DATE:\t" + calendar.get(Calendar.DATE));
        System.out.println("HOUR:\t" + calendar.get(Calendar.HOUR));
        System.out.println("HOUR OF DAY:\t" + calendar.get(Calendar.HOUR_OF_DAY));

        System.out.println("MINUTE:\t" + calendar.get(Calendar.MINUTE));
        System.out.println("SECOND:\t" + calendar.get(Calendar.SECOND));


        System.out.println("DAY OF WEEK:\t" + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY OF MONTH:\t" + calendar.get(Calendar.DAY_OF_MONTH));

    }
}
