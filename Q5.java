package presentation;

import java.util.Scanner;

public class question5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String sentence = input.nextLine();

        int total = 0;

        for (int i = 0; i < sentence.length(); i++) {

            char letter = sentence.charAt(i);

            switch (letter){

                case ' ':
                case 'a':
                case 'd':
                case 'g':
                case 'j':
                case 'm':
                case 'p':
                case 't':
                case 'w':
                    total = total + 1;
                    break;

                case 'b':
                case 'e':
                case 'h':
                case 'k':
                case 'n':
                case 'q':
                case 'u':
                case 'x':
                    total = total + 2;
                    break;

                case 'c':
                case 'f':
                case 'i':
                case 'l':
                case 'o':
                case 'r':
                case 'v':
                case 'y':
                    total = total + 3;
                    break;

                case 's':
                case 'z':
                    total = total + 4;
                    break;
            }
        }
        System.out.println(total);
    }
}


