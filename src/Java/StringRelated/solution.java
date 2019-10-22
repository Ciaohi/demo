package Java.StringRelated;

/**
 * Created by ciaohi on 2019/10/22 14:16
 */
public class solution {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int bit[] = new int[26];
        for(int i=0;i<s.length();i++){
            bit[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(--bit[t.charAt(i)-'a']<0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s="shw";
        String t="ehs";
        System.out.println(solution.isAnagram(s,t));
    }

}


