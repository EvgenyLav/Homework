package taskL4;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(isSumInRange(5, 10));
        printPositiveOrNegative(0);
        System.out.println(isNegative(-3));
        repeatString("Hello", 3);
        System.out.println(isLeapYear(2024));
        replaceZeros();
        fillArray();
        modifyArray();
        fillDiagonalMatrix(5);
        int[] array = createArray(5, 7);
    }

    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    static void checkSumSign() {
        int a = -5, b = 10;
        System.out.println((a + b >= 0) ? "Сумма положительная" : "Сумма отрицательная");
    }

    static void printColor() {
        int value = 75;
        if (value <= 0) System.out.println("Красный");
        else if (value <= 100) System.out.println("Желтый");
        else System.out.println("Зеленый");
    }

    static void compareNumbers() {
        int a = 7, b = 3;
        System.out.println((a >= b) ? "a >= b" : "a < b");
    }

    static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    static void printPositiveOrNegative(int num) {
        System.out.println((num >= 0) ? "Положительное" : "Отрицательное");
    }

    static boolean isNegative(int num) {
        return num < 0;
    }

    static void repeatString(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static void replaceZeros() {
        int[] array = {1, 0, 1, 0, 0, 1, 1, 0};
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 1 ? 0 : 1;
        }
    }

    static void fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    static void modifyArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] *= 2;
        }
    }

    static void fillDiagonalMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;
        }
    }

    static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }




    }
