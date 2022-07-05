package BasicsJava;

import java.util.Arrays;

public class App {
    public static int bigLettersCount(String str) {

        var count = 0;

        for (var i = 0; i < str.length(); i++) {

            if (str.charAt(i) == Character.toUpperCase(str.charAt(i))) {

                count += 1;

            }

        }
        return count;

    }

    public static boolean greaterThan(String str1, String str2) {

        return App.bigLettersCount(str1) > App.bigLettersCount(str2);
    }

    public static void main(String[] args) {

        var result3 = App.bigLettersCount("Hexlet");
        System.out.println(result3);

    }
}
