package kyu6.PlayingWithDigits;

public class PlayingWithDigits {
    public static void main(String[] args) {
        System.out.println(digPow(46288, 3));
    }

    public static long digPow(int n, int p) {
        int total = 0;
        String str = n + "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            total += (int) Math.pow(Character.getNumericValue(chars[i]), p + i);
        }
        if (total % n == 0) return total / n;
        else return -1;
    }
}
