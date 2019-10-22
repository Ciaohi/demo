package Java.StringRelated;

/**
 * Created by ciaohi on 2019/10/22 10:35
 */
public class StringMethodSub {
    public static void main(String args[]) {
        String Str = new String("ciaohi.github.io");

        System.out.print("返回值 :" );
        System.out.println(Str.substring(4) );

        System.out.print("返回值 :" );
        System.out.println(Str.substring(4, 10) );
    }

}
