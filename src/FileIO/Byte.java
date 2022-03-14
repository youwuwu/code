package FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Byte {
    public static void main(String[] args)throws Exception{
        FileInputStream input = new FileInputStream("Text/law.txt");
        FileOutputStream output = new FileOutputStream("Text/other-law.txt");
        int i;
        while ((i=input.read())!=-1){
            System.out.println(i);       //用字节流对象无法输出汉字，因为input.read()的返回值为int型的byte型数值.
            output.write(i);
        }
        input.close();
        output.close();
    }
}
