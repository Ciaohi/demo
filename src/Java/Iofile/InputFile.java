package Java.Iofile;

import java.io.File;

/**
 * Created by ciaohi on 2019/10/21 8:35
 */
public class InputFile {
    public static void main(String[] args) {
        String path = "G:/Typora";
        test(path);
    }

    private static void test(String path) {
        File f = new File(path);
        File[] fs = f.listFiles();
        if (fs == null) {
            return;
        }
        for (File file : fs) {
            if (file.isFile()) {
                System.out.println(file.getPath());
            } else {
                test(file.getPath());
            }
        }
    }

}




