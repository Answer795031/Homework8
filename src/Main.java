import java.io.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");

        /*
        Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
         */

        int [] array1 = new int[]{1, 2, 3};

        float [] array2 = new float[]{1.57f, 7.654f, 9.986f};

        String [] array3 = new String[]{"Что", "такое", "осень", "это", "небо"};

        System.out.print("\n");
    }


    public static void task2() {
        System.out.println("Задача 2");

        /*
        Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.
         */

        int[] array1 = new int[]{1, 2, 3};
        int array1Len = array1.length;          // Длина массива 1

        float[] array2 = new float[]{1.57f, 7.654f, 9.986f};
        int array2Len = array2.length;          // Длина массива 2

        String[] array3 = new String[]{"Что", "такое", "осень", "это", "небо"};
        int array3Len = array3.length;          // Длина массива 3

        /*
        Ввел переменные для определения длин массивов чтобы циклы вывода работали корректно при увеличении
        количества элементов в массивах, хоть это и не требуется сейчас.
        */

        System.out.print("Массив 1: ");         // Вывод элементов массива 1
        for (int i = 0; i < array1Len; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.print("\n");

        System.out.print("Массив 2: ");         // Вывод элементов массива 2
        for (int i = 0; i < array2Len; i++){
            System.out.print(array2[i] + " ");
        }
        System.out.print("\n");

        System.out.print("Массив 3: ");         // Вывод элементов массива 3
        for (int i = 0; i < array3Len; i++){
            System.out.print(array3[i] + " ");
        }
        System.out.println("\n");

    }

    public static void task3() {
        System.out.println("Задача 3");

        /*
        Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        */

        int[] array1 = new int[]{1, 2, 3};
        int array1Len = array1.length;          // Длина массива 1

        float[] array2 = new float[]{1.57f, 7.654f, 9.986f};
        int array2Len = array2.length;          // Длина массива 2

        String[] array3 = new String[]{"Что", "такое", "осень", "это", "небо"};
        int array3Len = array3.length;          // Длина массива 3

        System.out.print("Массив 1: ");         // Вывод элементов массива 1
        for (int i = array1Len - 1; i >= 0; i--){
            System.out.print(array1[i] + " ");
        }
        System.out.print("\n");

        System.out.print("Массив 2: ");         // Вывод элементов массива 2
        for (int i = array2Len - 1; i >= 0; i--){
            System.out.print(array2[i] + " ");
        }
        System.out.print("\n");

        System.out.print("Массив 3: ");         // Вывод элементов массива 3
        for (int i = array3Len - 1; i >= 0; i--){
            System.out.print(array3[i] + " ");
        }

        System.out.println("\n");

    }

    public static void task4() {
        System.out.println("Задача 4");

        /*
        Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
         */

        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int array1Len = array1.length;

        System.out.print("Массив 1: ");
        for (int i = 0; i < array1Len; i++){
            if (array1[i] % 2 != 0){
                array1[i]++;
            }
            System.out.print(array1[i] + " ");
        }

    }
}