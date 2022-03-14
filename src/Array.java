import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add((int) (Math.random() * 100));
        }
        for (Object obj : arrayList) {
            System.out.print(obj + "  ");
        }
        System.out.println();
        arrayList.addAll(arrayList);
        for (Object obj : arrayList
        ) {
            System.out.print(obj + "  ");
        }
        arrayList.set(0,1080);
        System.out.println();
        arrayList.addAll(arrayList);
        for (Object obj : arrayList
        ) {
            System.out.print(obj + "  ");
        }
    }
}
