package Java.DataStructure;

import java.util.Calendar;

/**
 * Created by ciaohi on 2019/10/22 11:27
 */
public class DateRelated {
    public static void main(String[] args) {
        Calendar.getInstance().getTimeInMillis();
        System.out.println(System.currentTimeMillis());
        Calendar time = Calendar.getInstance();
        System.out.println(time.getActualMaximum(Calendar.DAY_OF_MONTH));
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        System.out.println(cal.getTime());
    }
}
