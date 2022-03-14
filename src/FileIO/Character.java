package FileIO;

import java.io.FileReader;
import java.io.FileWriter;

public class Character {
    public static void main(String[] args) throws Exception{
        FileReader reader = new FileReader("Text/law.txt");
        FileWriter writer = new FileWriter("Text/other-law.txt");
        int i;
        while ((i = reader.read())!=-1){
            System.out.print((char) i);
            writer.write(i);
        }
        writer.close();
        reader.close();
    }
}
