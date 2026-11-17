
package com.mycompany.viva1;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        // Keep looping as long as there is still a '[' in the string
        while (str.indexOf('[') != -1) {
            int open = str.lastIndexOf('[');       // Find the innermost '['
            int close = str.indexOf(']', open);    // Find its matching ']'

            // Extract the number D (1 or 2 digits) right after '['
            int num = 0;
            int i = open + 1;
            while (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num = num * 10 + (str.charAt(i) - '0');
                i++;
            }

            // Extract the substring X after the digits up to ']'
            String word = str.substring(i, close);

            // Repeat X 'num' times
            String repeated = "";
            for (int k = 0; k < num; k++) {
                repeated = repeated + word;
            }

            // Replace "[DX]" with the expanded string
            str = str.substring(0, open) + repeated + str.substring(close + 1);
        }

        System.out.println(str);
    }
}
