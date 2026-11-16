import java.util.*;
import java.math.BigInteger;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next(); // read S
        BigInteger L = new BigInteger(sc.next()); // read L

        HashMap<Character, Integer> count = new HashMap<>(); // create hash map to count the occurence for every character
        for (char c : S.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1); // plus 1 to the exsisting char, if not then create new one
        }

        int max = Collections.max(count.values()); // get the max count 

        BigInteger len = BigInteger.valueOf(S.length()); // len = length of S
        BigInteger add = BigInteger.valueOf(max); // add = max count
        int answer = 0; // count the step

        while (len.compareTo(L) < 0) {  // this while loop actually keep iterate and adding the add into len until it >= L
            len = len.add(add);
            add = add.shiftLeft(1);
            answer++;
        }
        System.out.println(answer); // print the answer
        sc.close();
    }
}