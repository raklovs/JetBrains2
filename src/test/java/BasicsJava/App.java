package BasicsJava;

import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;
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

    public static boolean isPowerOfThree(long number) {


        if (number < 1) {

            return false;
        }

        if (number == 1) {

            return true;
        }

        for (var i = 0; number % 3 == 0; i++) {

            number /= 3;

        }
        return number == 1;
    }

//    var current = 1;
//        while (current <= number) {
//        if (current == number) {
//            return true;
//        }
//        current *= 3;
//    }
//
//        return false;


    public static void main(String[] args) {

        var result3 = App.bigLettersCount("HexLet");
        System.out.println(result3);
        System.out.println(App.isPowerOfThree(6));

    }
}
