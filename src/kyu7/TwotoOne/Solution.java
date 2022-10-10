package kyu7.TwotoOne;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String a = "xyaabbbccccdefww";
        String b = "xxxxyyyyabklmopq";
        System.out.println(longest(a,b));
    }

    public static String longest(String s1, String s2) {

        StringBuilder sb = new StringBuilder(s1+s2);

        for (int i = 0; i < sb.length(); i++) {
            for (int j = i + 1; j < sb.length(); j++) {
                if(sb.charAt(i) == sb.charAt(j)) sb.replace(j,j+1," ");
            }
        }

        char[] chars = sb.toString().toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars).replaceAll(" ","");
    }
}
