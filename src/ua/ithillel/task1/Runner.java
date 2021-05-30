package ua.ithillel.task1;

import java.util.Arrays;

public class Runner {

    public void run() {
        System.out.println("I run from task1");
        Integer[] arrInt = new Integer[]{10, 15, 250, 5};
        Double[] arrDab = new Double[]{15.2, 24.5, 5.22, 48.75};
        System.out.println(Arrays.toString(arrInt));
        System.out.println("Элементов больше чем 11: ");
        MyTestMethod.calcNum(arrInt, 11);
        System.out.println();
        System.out.println(Arrays.toString(arrDab));
        System.out.println("Элементов больше чем 15,5: ");
        MyTestMethod.calcNum(arrDab, 15.5);
        System.out.println("----");
        MyTestMethod.calcSum(arrInt, 11);
        System.out.println("----");
        MyTestMethod.calcSum(arrDab, 9.5);

    }
}
