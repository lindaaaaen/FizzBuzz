package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = 0;

        // loop from 1 to 999
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }

        System.out.println("Number of multiples of 3 or 5 below 1000: " + count);
    }
}