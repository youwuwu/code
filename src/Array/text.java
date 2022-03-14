package Array;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class text {
    public static void main(String[] args) throws Exception {
        ArrayList list = new ArrayList();
        BufferedReader reader = new BufferedReader(new FileReader("Text/name.txt"));
        String nameLine = reader.readLine();
        String [] names = nameLine.split(" ");
        for (int i = 0; i < names.length; i++) {
            list.add(names[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        list.addAll(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
