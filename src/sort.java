public class sort {
    public static void sort(Comparable[] array) {
        Comparable order;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (less(array[i], array[j])) {
                    exch(array, i, j);
                }
            }
        }
    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] array, int i, int j) {
        Comparable t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void show(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            int order = i + 1;
            System.out.print(array[i] + "  ");
            if (order % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static boolean isSorted(Comparable[] array) {
        for (int i = 1; i < array.length; i++) {
            if (less(array[i], array[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Comparable[] array = {1,9,6,4,8,5,10,16,22};
        sort(array);
        show(array);
        System.out.println();
        System.out.println(isSorted(array));
    }
}
