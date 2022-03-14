package DataMakeup;

public class orderTest {
    public static void main(String[] args) {
        orderList list = new orderList(360);
        for (int i = 0; i < list.getMaxSize(); i++) {
            list.insert(i, (int) (Math.random()*1000));
        }
        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.query(i) + " ");
            if ((i+1) % 40 == 0) {
                System.out.println();
            }
        }
    }
}
