package kyu7.JadenCasingStrings;

public class JadenCasingStrings {
    public static void main(String[] args) {
        String phrase = "most trees are blue";
        System.out.println(toJadenCase(phrase));
    }


    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if (phrase == null || phrase.equals("")) return null;
        StringBuilder sb = new StringBuilder(phrase);
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ')
                sb.setCharAt(i + 1, Character.toUpperCase(sb.charAt(i + 1)));
        }

        return sb.toString();
    }
}