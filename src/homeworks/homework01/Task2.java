package homeworks.homework01;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)    {
        System.out.println("Игра \"Камень, ножницы, бумага\" \nКамень - 0 \nНожницы - 1 \nБумага - 2");
        Scanner scan = new Scanner(System.in);
        System.out.print("Ход Васи: ");
        byte num1 = scan.nextByte();
        System.out.print("Ход Пети: ");
        byte num2 = scan.nextByte();
        if (num1 == 0 && num2 == 0 ) System.out.println("НИЧЬЯ");
        else if (num1 == 1 && num2 == 1 ) System.out.println("НИЧЬЯ");
        else if (num1 == 2 && num2 == 2 ) System.out.println("НИЧЬЯ");
        else if (num1 == 0 && num2 == 2 ) System.out.println("ПОБЕДИЛ ПЕТЯ");
        else if (num1 == 1 && num2 == 0 ) System.out.println("ПОБЕДИЛ ПЕТЯ");
        else if (num1 == 2 && num2 == 1 ) System.out.println("ПОБЕДИЛ ПЕТЯ");
        else if (num1 == 0 && num2 == 1 ) System.out.println("ПОБЕДИЛ ВАСЯ");
        else if (num1 == 1 && num2 == 2 ) System.out.println("ПОБЕДИЛ ВАСЯ");
        else if (num1 == 2 && num2 == 0 ) System.out.println("ПОБЕДИЛ ВАСЯ");
    }
}
