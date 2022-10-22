package kyu6.BuildAPileOfCubes;

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(digital_root(156));
    }

    public static int digital_root(int n) {
        String str = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        if (String.valueOf(sum).length() > 1) {
            return digital_root(sum);
        } else return sum;
    }
}
