package ua.ithillel.task1;

public class MyTestMethod {

    public static <T extends Comparable<T>> void calcNum(T[] arr, T value) {
        int counter = 0;
        for (T i : arr) {
            if (i.compareTo(value) > 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static <T extends Number & Comparable<T>> void calcSum(T[] arr, T value) {
        Double counter = 0.0;
        for (T i : arr) {
            if (i.compareTo(value) > 0) {
                counter += i.doubleValue();
            }
        }
        System.out.println(counter);
    }
}
