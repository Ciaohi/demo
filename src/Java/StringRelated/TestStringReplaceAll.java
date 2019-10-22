package Java.StringRelated;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ciaohi on 2019/10/22 13:54
 */
public class TestStringReplaceAll {

    public static void main(String[] args) {
        String str = "a1s2d3f4h5j6k7";
        // 将字符串中的数字全部替换为 0
        System.out.println(replaceAll(str, "\\d", "0"));
    }
    /**
     * @param str:源字符串
     * @param regex:正则表达式
     * @param newStr:替换后的子字符串
     * @return 返回替换成功后的字符串
     */
    public static String replaceAll(String str, String regex, String newStr)
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher mathcer = pattern.matcher(str);
        String reslut = mathcer.replaceAll(newStr);
        return reslut; }


}
