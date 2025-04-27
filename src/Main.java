import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
// Задание №1
        System.out.println("Задание №1");
        int [] arrInt = new int [3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
        float [] arrFloat = {1.57F, 7.654F, 9.986F};
        byte [] arrByte = {1, 2, 3, 4, 5, 6, 7, 11};
// Задание №2
        System.out.println("Задание №2");
        for ( int i = 0; i < arrInt.length; i++) {
            if (i == arrInt.length - 1) {
                System.out.println(arrInt[i]);
                break;
            }
            System.out.print(arrInt[i] + ", ");
        }
        for ( int i = 0; i < arrFloat.length; i++) {
            if (i == arrFloat.length - 1) {
                System.out.println(arrFloat[i]);
                break;
            }
            System.out.print(arrFloat[i] + ", ");
        }
        for ( int i = 0; i < arrByte.length; i++) {
            if (i == arrByte.length - 1) {
                System.out.println(arrByte[i]);
                break;
            }
            System.out.print(arrByte[i] + ", ");
        }

// Задание №3
        System.out.println("Задание №3");
        for ( int i = arrInt.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrInt[i]);
                break;
            }
            System.out.print(arrInt[i] + ", ");
        }
        for ( int i = arrFloat.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrFloat[i]);
                break;
            }
            System.out.print(arrFloat[i] + ", ");
        }
        for ( int i = arrByte.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrByte[i]);
                break;
            }
            System.out.print(arrByte[i] + ", ");
        }

// Задание №4
        System.out.println("Задание №4");
        for ( int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] %2 != 0) {
                arrInt [i] += 1;
            }
        }
        System.out.printf(Arrays.toString(arrInt));
    }
}