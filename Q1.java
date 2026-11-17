
package presentation;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String isbn = input.nextLine();
        String number = isbn.replace("-", "");

        int sum = 0;

        for (int i = 0; i < 9; i++) {
            int digit = number.charAt(i) - '0';
            sum = sum + digit * (i + 1);
        }

        int check = sum % 11;
        String correct;

        if (check == 10) {
            correct = "X";
        } else {
            correct = "" + check;
        }

        String last = number.substring(9);

        if (last.equals(correct)) {
            System.out.println("Right");
        } else {
            System.out.println(
                isbn.substring(0, 12) + correct
            );
        }
    }   
}
