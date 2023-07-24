package countPrime;

import java.util.Scanner;

public class CountPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(count(number));
    }

    public static int count(int number) {
        int count = 0;
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number == 1 || number == 0) {
                flag = false;
                continue;

            }
            for (int j = 2; j < i / 2; i++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                // flag = false;
            }

        }
        return count;
    }

}
