
package TEST;

import java.util.*;

public class Q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ArrayList<String> substrings = new ArrayList<>();
        ArrayList<Integer> starts = new ArrayList<>();
        ArrayList<Integer> ends = new ArrayList<>();

        // Generate all substrings
        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                String sub = s.substring(i, j);

                substrings.add(sub);
                starts.add(i + 1);
                ends.add(j);
            }
        }

        // Sort the substrings in lexicographical order
        for (int i = 0; i < substrings.size(); i++) {

            for (int j = i + 1; j < substrings.size(); j++) {

                if (substrings.get(i).compareTo(substrings.get(j)) > 0) {

                    String temp = substrings.get(i);
                    substrings.set(i, substrings.get(j));
                    substrings.set(j, temp);

                    int tempStart = starts.get(i);
                    starts.set(i, starts.get(j));
                    starts.set(j, tempStart);

                    int tempEnd = ends.get(i);
                    ends.set(i, ends.get(j));
                    ends.set(j, tempEnd);
                }
            }
        }

        // Print all substrings
        for (int i = 0; i < substrings.size(); i++) {

            System.out.println(substrings.get(i) + " "
                    + starts.get(i) + " "
                    + ends.get(i));
        }

        sc.close();
    }
}

