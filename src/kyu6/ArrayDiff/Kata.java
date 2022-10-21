package kyu6.ArrayDiff;

import java.util.ArrayList;
import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{2})));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> arrayListA = new ArrayList<>(Arrays.stream(a).boxed().toList());
        ArrayList<Integer> arrayListB = new ArrayList<>(Arrays.stream(b).boxed().toList());
        arrayListA.removeAll(arrayListB);

        return arrayListA.stream().mapToInt(i -> i).toArray();
    }
}