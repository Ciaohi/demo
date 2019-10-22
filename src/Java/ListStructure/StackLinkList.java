package Java.ListStructure;

import java.util.LinkedList;

/**
 * Created by ciaohi on 2019/10/22 22:28
 */
public class StackLinkList {
    LinkedList list = new LinkedList();

    public synchronized void push(Object x) {
        synchronized (list) {
            list.addLast(x);
            notify();
        }
    }

    public synchronized Object pop() throws Exception {
        synchronized (list) {
            if (list.size() <= 0) {
                wait();
            }
            return list.removeLast();
        }
    }
}