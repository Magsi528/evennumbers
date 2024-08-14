package logic;

public class DIsplayEvenNumbers {
    public void displayEvenNumbersUpTo(int number) {
        System.out.println("Even numbers from 1 to " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
