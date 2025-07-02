package AdvJav.adv;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class gregurion {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + c.get(Calendar.MINUTE));

        GregorianCalendar cv = new GregorianCalendar();
        System.out.println(cv.isLeapYear(2024));

    }
}
