package Java.DataStructure;

/**
 * Created by ciaohi on 2019/10/20 23:13
 */
public class AutoIntegerBox {
    public static void main(String[] args) {
        Integer a = new Integer(3);
        Integer b = 3; // 将 3 自动装箱成 Integer 类型
        int c = 3;
        System.out.println(a == b); // false 两个引用没有引用同一
        System.out.println(a == c); // true a 自动拆箱成 int 类
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
        System.out.println(f1 == f2);
        System.out.println(f3 == f4);

    }
}
