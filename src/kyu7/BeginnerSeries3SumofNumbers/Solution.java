package kyu7.BeginnerSeries3SumofNumbers;

public class Solution {
    public static void main(String[] args) {
        System.out.println(GetSum(0, -4)); //10 //a>b a<b
    }

    public static int GetSum(int a, int b) {
        if (a == b) return a;
        int sum = 0;
        for (a = a; a > b; a--) {
            sum += a;
        }
        for (a = a; a < b; a++) {
            sum += a;
        }
        return sum + b;
    }
}