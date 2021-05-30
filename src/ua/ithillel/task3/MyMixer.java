package ua.ithillel.task3;

import java.util.Arrays;
import java.util.Random;

public class MyMixer<T> {
    private T[] arr;

    public MyMixer(T[] arr) {
        this.arr = arr;
    }

    public void shuffle() {
        T[] temp = Arrays.copyOf(arr, arr.length);
        System.out.println("Array before shuffle");
        System.out.println(Arrays.toString(temp));
        Arrays.fill(temp, null);
        Random r = new Random();
        int i = 0;
        while (Arrays.asList(temp).contains(null) && i != temp.length) {
            int j = r.nextInt(temp.length);
            if (temp[j] == null) {
                temp[j] = arr[i];
                i++;
            }
        }
        arr = temp;
        System.out.println("Array after shuffle");
        System.out.println(Arrays.toString(arr));
    }
}
