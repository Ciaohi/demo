package Java.StringRelated;

/**
 * Created by ciaohi on 2019/10/22 10:01
 */
public class StringReverse {
    public static String reverse(String originStr) {
        if(originStr == null || originStr.length() <= 1)
            return originStr;
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }

    public static String reverse2(String str) {
        StringBuilder result = new StringBuilder("");
        char[] chArra = str.toCharArray();
        for (int i = chArra.length - 1; i >= 0; i--) {
            char ch = chArra[i];
            result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String test="asdfs";
        System.out.println(StringReverse.reverse2(test));
    }
}
