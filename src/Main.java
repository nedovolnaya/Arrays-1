import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double[] arr1 = {-1.57, 7.654, 9.986};

        float[] array = new float[5];
        array[0] = -3.4f;
        array[1] = -2.2f;
        array[2] = -4.4f;
        array[3] = -8.8f;
        array[4] = 1.1f;
        System.out.println();
    }


    public static void task2() {
        System.out.println("Задача 2");

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for (int index = 0; index < arr.length; index++) {
            if (index == arr.length - 1) {
                System.out.print(arr[index]);
                break;
            }
            System.out.print(arr[index] + ", ");
        }
        System.out.println();

        double[] arr1 = {-1.57, 7.654, 9.986};
        for (int index = 0; index < arr1.length; index++) {
            if (index == arr.length - 1) {
                System.out.print(arr1[index]);
                break;
            }
            System.out.print(arr1[index] + ", ");
        }
        System.out.println();

        float[] array = new float[5];
        array[0] = -3.4f;
        array[1] = -2.2f;
        array[2] = -4.4f;
        array[3] = -8.8f;
        array[4] = -1.1f;
        for (int index = 0; index < array.length; index++) {
            if (index == array.length - 1) {
                System.out.print(array[index]);
                break;
            }
            System.out.print(array[index] + ", ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ",");
        }
        System.out.println();

        double[] arr1 = {-1.57, 7.654, 9.986};
        for (int index = arr1.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(arr1[index]);
                break;
            }
            System.out.print(arr1[index] + ", ");
        }
        System.out.println();

        float[] array = new float[5];
        array[0] = -3.4f;
        array[1] = -2.2f;
        array[2] = -4.4f;
        array[3] = -8.8f;
        array[4] = -1.1f;
        for (int index = array.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.print(array[index]);
                break;
            }
            System.out.print(array[index] + ", ");
        }
        System.out.println();

    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        }
            System.out.println( Arrays.toString(arr));

        }

    }
