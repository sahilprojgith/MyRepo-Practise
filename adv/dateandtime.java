package AdvJav.adv;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class dateandtime {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        Date d = new Date();
        System.out.println(d);
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getTimeZone());
        System.out.println(c.getTime());
    }
}
