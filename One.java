package ru.mirea.arkabaev.lab1;
import java.util.*;

public class One {
    public static void main(String[] args) {
        int sum = 0;
        int i;
        int[] array = new int[10];
        Random rnd = new Random();
        for (i = 0; i < array.length; i++)
            array[i] = rnd.nextInt();
        System.out.println("Sum with random values and FOR-loop");
        System.out.print("Inserted array elements:");
        for (i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
            sum = sum + array[i];
        }
        System.out.println("\nSum is " + sum);
        sum = 0;

        System.out.println("Sum with values from user and FOR-loop");
        Scanner input = new Scanner(System.in);
        System.out.println("Insert array elements:");
        for (i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            sum = sum + array[i];
        }
        System.out.println("Sum is " + sum);
        sum = 0;

        System.out.println("Sum with values from user and WHILE-loop");
        System.out.println("Insert array elements:");
        i = 0;
        while (i < array.length) {
                array[i] = input.nextInt();
                sum = sum + array[i];
                i++;
            }
        System.out.println("Sum is " + sum);
        sum = 0;

        System.out.println("Sum with values from user and DO...WHILE-loop");
        System.out.println("Insert array elements:");
        i = 0;
        do {
            array[i] = input.nextInt();
            sum = sum + array[i];
            i++;
        } while (i < array.length);
        System.out.println("Sum is " + sum);
        }
    }

