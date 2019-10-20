package Java.DataStructure;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ciaohi on 2019/10/19 15:03
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<Key, String> map=new HashMap<>();
        map.put(new Key("博主"),"Ciaohi");
        map.put(new Key("方向"),"Java");
        map.put(new Key("地址"),"ciaohi.github.io");
        map.put(new Key("博客样式"),"yilia");
        map.put(new Key("博客工具"),"hexo");

    }


    static class Key{
        private String name;
        public Key(String name){
            this.name=name;
        }
        @Override
        public boolean equals(Object o){
            if(this==o) return true;
            if(o==null || getClass()!=o.getClass()) return false;

            Key key=(Key) o;

            return name !=null ? name.equals(key.name) : false;
        }

        @Override
        public int hashCode(){
            return name !=null ? name.substring(0,2).hashCode():0;
        }
        @Override
        public String toString(){
            return name;
        }

    }

}
