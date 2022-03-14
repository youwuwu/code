package DataMakeup;

public class orderList {
    private int maxSize;
    private int size;
    private int defaultSize = 100;
    private int[] list;
    private int value;

    public orderList() {
        maxSize = defaultSize;
        size = 0;
        list = new int[maxSize];
    }

    public orderList(int Size) {
        maxSize = Size;
        size = 0;
        list = new int[maxSize];
    }

    public int query(int num) {
        return list[num];
    }

    public int delete(int num) {
        value = list[num];
        for (int i = num; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        size--;
        return value;
    }

    public void insert(int num, int value) {
        for (int i = size - 1; i >= num; i--) {
            list[i + 1] = list[i];
        }
        list[num] = value;
        size++;
    }

    public int getSize() {
        return size;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public boolean isEmpty() {
        boolean bool = size == 0;
        return bool;
    }
}
