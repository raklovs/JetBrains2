package Hexlet_Arrays;

import java.util.Arrays;

class App1 {
    public static String[] getWeekends(String format) {

        String[] daysWeekendsLong = {"saturday", "sunday"};

        String[] daysWeekendsShort = {"sat", "sun"};

        if (format.equals("short")) {

            return daysWeekendsShort;

        }

        return daysWeekendsLong;

    }

    public static int[] swap(int[] arraysIntegers) {

        int[] result = new int[arraysIntegers.length];

        if (arraysIntegers.length > 1) {

            for (int i = 0; i < arraysIntegers.length; i++) {

                if (i == 0 | i == arraysIntegers.length - 1) {

                    result[i] = arraysIntegers[arraysIntegers.length - (i + 1)];

                } else {

                    result[i] = arraysIntegers[i];

                }

            }

            return result;

        }

        return arraysIntegers;

    }

    public static int[] reversNumbers(int[] arraysIntegers) {

        int[] result = new int[arraysIntegers.length];

        if (arraysIntegers.length > 1) {

            for (int i = 0; i < arraysIntegers.length; i++) {

                result[i] = arraysIntegers[arraysIntegers.length - (i + 1)];

            }

            return result;

        }

        return arraysIntegers;

    }

    public static String[] addPrefix(String[] names, String prefix) {

        String[] prefixNames = new String[names.length];

        for (var i = 0; i < names.length; i++) {

            prefixNames[i] = prefix + " " + names[i];

        }
        return prefixNames;
    }

    public static int calculateSum(int[] numbers1) {

        var sum = 0;

        for (var i = 0; i < numbers1.length; i++) {

            if (numbers1[i] % 3 == 0) {

                sum += numbers1[i];

            }

        }
        return sum;

    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        var result2 = App1.swap(numbers);
        System.out.println(Arrays.toString(result2));

        String[] names = {"John", "Smit", "Karl"};
        var namesWithPrefix = App1.addPrefix(names, "Mr.");
        System.out.println(Arrays.toString(namesWithPrefix));

        int[] numbers1 = {};
        System.out.println(App1.calculateSum(numbers1));


    }
}
