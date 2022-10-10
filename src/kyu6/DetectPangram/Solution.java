package kyu6.DetectPangram;

public class Solution {
    public static void main(String[] args) {
        String sentence = "owb grvmpquijyxzsctfnlheakd";
        System.out.println(check(sentence));

    }

    public static boolean check(String sentence) {
        String str = sentence.toLowerCase();
        char[] alphabetChars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] strChars = str.toCharArray();
        int[] count = new int[alphabetChars.length];

        for (int i = 0; i < alphabetChars.length; i++) {
            for (char strChar : strChars) {
                if (alphabetChars[i] == strChar) count[i]++;
            }
        }
        for (int j : count) {
            if (j == 0) return false;
        }
        return true;
    }
}