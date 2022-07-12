package Hexlet_Arrays;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

import org.apache.commons.lang3.ArrayUtils;

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

    public static int mult(int[] numbers3) {

        var composition = 1;

        for (var number : numbers3) {

            composition *= number;
        }

        return composition;
    }
//int[] numbers = {1, 2, 3, 6, 1, 3};
    public static int[] getSameParity(int[] numbers) {

        if (numbers.length == 0) {
            return numbers;
        }
        var even = 0; // четное число
        var odd = 0; // нечетное число
        for (var a = 0; a < numbers.length; a++) {

            if (numbers[a] % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        int evenOrOddNum;

        if (numbers[0] % 2 == 0) {
            evenOrOddNum = even;
        } else {
            evenOrOddNum = odd;
        }

        var result = new int[evenOrOddNum];
        result[0] = numbers[0];

        for (int i = 1, j = 1; i < numbers.length; i++) {

            if (numbers[0] % 2 != 0) {

                if (numbers[i] % 2 != 0) {
                    int newIndex = j;
                    result[newIndex] = numbers[i];
                    j++;
                }

            } else {
                if (numbers[i] % 2 == 0) {
                    int newIndex = j;
                    result[newIndex] = numbers[i];
                    j++;
                }
            }
        }
        return result;
    }

    public static int[] remove(int[] values, int index) {
        // Создаем пустой массив размером на один меньше чем исходный
        // так как мы удаляем один элемент
        var result = new int[values.length - 1];

        for (var i = 0; i < values.length; i++) {
            if (i != index) { // Копируем все кроме index
                // Элементы стоящие дальше index смещаются влево
                var newIndex = i < index ? i : i - 1;
                result[newIndex] = values[i];
            }
        }

        return result;
    }

    public static int getTotalAmount(String[] money, String currencyName) {

        //Метод должен возвращать сумму денег указанной валюты.
        var resultSum = 0;


        for (var currName : money) {

            if (currName.substring(0, 3).equals(currencyName)) {

                int sum = Integer.parseInt(currName.substring(3).trim());

                resultSum += sum;
            }

        }
        return resultSum;
    }

    public static int[] flattenMatrix(int[][] matrix) {

        //Метод принимает в качестве аргумента матрицу целых чисел (двухмерный массив)
        // и записывает её элементы в одномерный массив.
        // Если на вход передана пустая матрица, метод должен вернуть пустой массив.
        //            0  1  2
        //matrix[0] = 1, 2, 3
        //matrix[1] = 4, 5, 6

        if (matrix.length == 0) {
            return new int[0];
        }
        var leng = (matrix.length * matrix[0].length);

        int[] newMatrix = new int[leng];

        for (int i = 0, a = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix[a] = matrix[i][j];
                a++;
            }

        }
        return newMatrix;
    }
    public static String buildDefinitionList(String[][] definitions) {
        //Реализуйте публичный статический метод buildDefinitionList(),
        // который генерирует HTML список определений (теги <dl>, <dt> и <dd>)
        // и возвращает получившуюся строку. При отсутствии элементов в массиве метод возвращает пустую строку.

        if (definitions.length == 0) {
            return "";
        }

        var result = new StringBuilder("<dl>");
        for (String[] def1 : definitions) {

                    result.append("<dt>");//<dt>key</dt>
                    result.append(def1[0]);
                    result.append("</dt>");

                    result.append("<dd>");//<dt>key</dt>
                    result.append(def1[1]);
                    result.append("</dd>");

        }
        result.append("</dl>");
        return result.toString();
    }

    public static String makeCensored(String text, String[] stopWords) {
//Реализуйте публичный статический метод makeCensored(), который заменяет каждое вхождение указанного слова
// в предложении на последовательность $#%! и возвращает полученную строку.
        String correction = "$#%!";
        var wordsArrays = text.split(" ");
        var result = new StringJoiner(" ");

        for (var word : wordsArrays) {

            for (var stopWord : stopWords) {

                if (word.equals(stopWord)) {
                    word = correction;
                }

            }
            result.add(word);
        }

        return result.toString();
    }

    public static int countUniqChars(String text) {
        if (text.equals("")) {
            return 0;
        }
        var count = 0;
        var charArrays = text.toCharArray();
        char[] getCopy = new char[charArrays.length];
        for (int i = 0; i < charArrays.length; i++) {

            if (!ArrayUtils.contains(getCopy, charArrays[i])) {

                getCopy[i] = charArrays[i];
                count += 1;
            }

        }

        return count;

    }

    public static int[] bubbleSort(int[] numbers) {
        int a, b, t;
        var size = numbers.length;

        for (a = 0; a < size; a++) {
            for (b = size - 1; b > a; b--) {
                if (numbers[b - 1] > numbers[b]) {
                    t = numbers[b];
                    numbers[b] = numbers[b - 1];
                    numbers[b - 1] = t;
                }
            }
        }
        return numbers;

    }

    public static int[] getIntersectionOfSortedArrays(int[] num1, int[] num2) {
        int i, j;
        var index = 0;
        var sort = new int[num1.length + num2.length];
        boolean found = false;


        for (i = 0; i < num1.length; ) {
            for (j = 0; i < num1.length && j < num2.length; ) {

                if (num1[i] > num2[j]) {
                    j++;
                } else if (num1[i] == num2[j]) {
                    sort[index] = num1[i];
                    found = true;
                    index++;
                    i++;
                    j++;
                } else {
                    i++;
                }

            }
            sort = Arrays.copyOfRange(sort, 0, index);
            i = num1.length;

        }
        int[] num3 = {};
        return found ? sort : num3;
    }


    public static void main(String[] args) {

        int[] num1 = {10, 11, 24};
        int[] num2 = {10, 13, 14, 18, 24, 30};
        var result1 = App1.getIntersectionOfSortedArrays(num1, num2);
        System.out.println(Arrays.toString(result1)); // => [10, 24]

//        int[] numbers = {3, 10, 4, 3};
//        App1.bubbleSort(numbers);
//        System.out.println(Arrays.toString(numbers)); // => [3, 3, 4, 10]
//        var text = "You know nothing Jon Snow";
//        System.out.println(App1.countUniqChars(text)); // 3
//        String[][] definitions = {
//                {"definition1", "description1"},
//                {"definition2", "description2"},
//        };
//        System.out.println(App1.buildDefinitionList(definitions));
//
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        var result = App1.flattenMatrix(matrix);
//        System.out.println(Arrays.toString(result)); // => [1, 2, 3, 4, 5, 6]
//
//        String[] money = {"eur 10", "usd 1", "usd 10", "rub 50", "usd 5"};
//        System.out.println(App1.getTotalAmount(money, "usd")); // 16
//
//        int[] numbers4 = {1, 5, 8, 100};
//
//        System.out.println(Arrays.toString(App1.remove(numbers4, 2)));
//
//        int[] numbers = {-1, 2, 3, 6, 1, 3};
//        System.out.println(Arrays.toString(App1.getSameParity(numbers))); // [1, 3]
//        int[] numbers = {1, 2, 3, 4, 5, 6};
//        var result2 = App1.swap(numbers);
//        System.out.println(Arrays.toString(result2));
//
//        String[] names = {"John", "Smit", "Karl"};
//        var namesWithPrefix = App1.addPrefix(names, "Mr.");
//        System.out.println(Arrays.toString(namesWithPrefix));
//
//        int[] numbers1 = {};
//        System.out.println(App1.calculateSum(numbers1));
//
//        int[] numbers3 = {1, 4, 3, 4, 5};
//        System.out.println(App1.mult(numbers3)); // 240


    }
}
