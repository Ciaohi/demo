package Java.DataStructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ciaohi on 2019/10/26 14:53
 */
public class QueueTest {
    public static void main(String[] args) {
        //LinkedList Queue
        LinkedList<String>queue=new LinkedList<String>();
        queue.add("刘备");
        queue.add("关羽");
        queue.add("张飞");
        queue.pop();
        System.out.println(queue);
        String value=queue.poll();
        System.out.println(value);
        queue.poll();
        queue.poll();
        queue.poll();

    }
}
