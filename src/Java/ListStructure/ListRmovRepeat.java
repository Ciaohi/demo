package Java.ListStructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by ciaohi on 2019/10/22 22:43
 */
public class ListRmovRepeat {

    public static void main(String[] args) {
        List<String> li1 = new ArrayList<String>();
        li1.add("8");
        li1.add("8");
        li1.add("9");
        li1.add("9");
        li1.add("0");
        System.out.println(li1);
        //方法:将List中数据取出来来存到Set中
        HashSet<String> set = new HashSet<String>();
        for(int i=0;i<li1.size();i++){
            set.add(li1.get(i));
        }
        System.out.println(set);
    }
}



