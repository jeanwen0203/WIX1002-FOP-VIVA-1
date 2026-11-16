import java.util.Scanner;

public class Q3Syllabus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();     // input S
        long L = sc.nextLong();   // input L

        // count the occurence for every character
        int[] count = new int[128];
        int max = 0;                    // highest count among all characters
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            count[c]++;
            if (count[c] > max) {
                max = count[c];
            }
        }

        // each operation on the most frequent character adds max, 2*max, 4*max, ...
        long need = L - S.length();     // how many more characters are still needed
        long add = max;                 // characters added by the next operation
        int step = 0;                   // number of operations

        while (need > 0) {
            need -= add;
            add *= 2;
            step++;
        }

        System.out.println(step);
        sc.close();
    }
}
