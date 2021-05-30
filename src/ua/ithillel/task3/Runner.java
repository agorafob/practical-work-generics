package ua.ithillel.task3;

public class Runner {
    public void run() {
        System.out.println("I run from task3");
        Integer[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        MyMixer<Integer> arr = new MyMixer<>(a);
        arr.shuffle();
        String[] b = {"a", "b", "c", "d", "e", "f", "g"};
        MyMixer<String> arr2 = new MyMixer<>(b);
        arr2.shuffle();
    }
}
