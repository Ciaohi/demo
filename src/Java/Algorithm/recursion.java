package Java.Algorithm;

/**
 * Created by ciaohi on 2019/10/26 8:59
 */
public class recursion {


    //方法递归
    public static void test(int n){
        //...:假如没有终止条件:就会报异常:StackOverflowError
        if(n>2){
            test(n-1);
        }else{
            System.out.println(n);
        }

    }

    public static void main(String[] args) {
        test(4);
        System.out.println("程序结束");
    }
}
