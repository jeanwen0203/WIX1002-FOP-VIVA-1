
package TEST;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLong()) {

            long number = sc.nextLong();

            long reversed = 0;
            long digit;

            boolean negative = false;

            if (number < 0) {
                negative = true;
                number = -number;
            }

            while (number > 0) {

                digit = number % 10;

                reversed = reversed * 10 + digit;

                number = number / 10;
            }

            if (negative) {
                reversed = -reversed;
            }

            System.out.println(reversed);
        }

        sc.close();
    }
}

