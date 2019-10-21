package Java.DataStructure;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ciaohi on 2019/10/20 16:37
 */
public class TestDateFormat {
    public static void main(String[] args) throws Exception {
        //第一步：将字符串（2019-10-20 10:53:10）转换成日期Date
        DateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String sdate="2013-02-18 10:53:10";
        Date date=sdf.parse(sdate);
        System.out.println(date);
        //第二步：将日期Date转换成字符串String
        DateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String sdate2=sdf2.format(date);
        System.out.println(sdate2);
    }

}
