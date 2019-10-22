package Java.DataStructure;

/**
 * Created by ciaohi on 2019/10/22 9:44
 */
public class staticOrdC {
    static{
        System.out.print("1");
    }
    public staticOrdC(){
        System.out.print("2");
    }
    public static void main(String[] args){
        staticOrdC ab = new B();

    }
}

class B extends staticOrdC{
    static{
        System.out.print("a");
    }
    public B(){
        System.out.print("b");
    }
}

