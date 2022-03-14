package Array;

import java.io.IOException;

public class one {
    public static void main(String[] args) {
        try {
            System.out.println(Runtime.getRuntime().exec("notepad.exe"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
