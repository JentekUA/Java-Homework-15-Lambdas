package app;

public class StringListProcessor {
    public static int countUpperCase(String s) {
        int count = 0;
        for (var c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }

        return count;
    }
}
