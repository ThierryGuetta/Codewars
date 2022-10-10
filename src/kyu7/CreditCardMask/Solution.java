package kyu7.CreditCardMask;

public class Solution {
    public static void main(String[] args) {
        String test = "Nananananananananananananananana Batman!";
        System.out.println(maskify(test));
    }

    public static String maskify(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length() - 4; i++) {
            sb.setCharAt(i, '#');
        }
        return sb.toString();
    }
}