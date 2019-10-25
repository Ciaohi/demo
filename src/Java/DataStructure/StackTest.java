package Java.DataStructure;

import java.util.Stack;

/**
 * Created by ciaohi on 2019/10/25 22:39
 */
public class StackTest {
    public static void main(String[] args) {
        //后进先出的特点,弹栈，压栈
        Stack<String> stack = new Stack<String>();
        //压栈
        stack.push("刘备");
        stack.push("关羽");
        stack.push("张飞");
        System.out.println(stack);
        //弹栈
        String v=stack.pop();
        System.out.println("弹出了谁:"+v);
        System.out.println(stack);

    }

}
