package main

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int number = sc.nextInt();

        logic.DIsplayEvenNumbers displayEvenNumbers = new logic.DIsplayEvenNumbers();
        displayEvenNumbers.displayEvenNumbersUpTo(number);

        sc.close();
    }
}
