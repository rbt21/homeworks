package homeworks.homework02;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        int res1 = num1 + num2;
        System.out.println("Сумма двух целых чисел: " + res1);
        int res2 = num1 - num2;
        System.out.println("Разница двух целых чисел: " + res2);
        int res3 = num1 * num2;
        System.out.println("Произведение из двух целых чисел: " + res3);
        float res4 = (num1 + num2) / 2;
        System.out.println("Среднее из двух целых чисел: " + res4);
        if (num1 >= num2) {
            int res5 = num1 - num2;
            System.out.println("Расстояние двух целых чисел: " + res5);
        } else {
            int res6 = (num1 - num2) * (-1);
            System.out.println("Расстояние двух целых чисел: " + res6);
        }
        if (num1 >= num2) {
            int res7 = num1;
            System.out.println("Максисальное целое число: " + res7);
        } else {
            int res8 = num2;
            System.out.println("Максисальное целое число: " + res8);
        }
        if (num1 >= num2) {
            int res9 = num2;
            System.out.println("Минимальное целое число: " + res9);
        } else {
            int res10 = num1;
            System.out.println("Минимальное целое число: " + res10);
        }
    }
}
