package kyu6.DetectPangram;

public class Solution {
    public static void main(String[] args) {
        String sentence = "owb grvmpquijyxzsctfnlheakd";
        System.out.println(check(sentence));

    }

    public static boolean check(String sentence) {
        for (char i = 'a'; i <= 'z'; i++) {
            if (!sentence.toLowerCase().contains("" + i)) return false;
        }
        return true;
    }
}