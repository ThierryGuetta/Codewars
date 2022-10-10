package kyu7.SquareEveryDigit;

import java.util.Arrays;

public class SquareEveryDigit {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(squareDigits(n));

    }

    public static int squareDigits(int n) {
        // TODO Implement me
        String str = n + "";
        StringBuilder res = new StringBuilder();
        char[] chars = str.toCharArray();
        for(char e : chars){
            int tmp = (int) Math.pow(Character.getNumericValue(e), 2);
            res.append(tmp);
        }
        return Integer.parseInt(res.toString());
    }
}
