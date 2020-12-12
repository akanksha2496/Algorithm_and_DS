Smallest Number With No Adjacent Duplicates
You are given a string s containing "1", "2", "3" and "?". Given that you can replace any “?” with "1", "2" or "3", return the smallest number you can make as a string such that no two adjacent digits are the same.

Constraints

n ≤ 100,000 where n is the length of s
Example 1
Input
s = "3?2??"
Output
"31212"
Example 2
Input
s = "???"
Output
"121"





import java.util.*;

class Solution {
    public String solve(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {
                TreeSet<Character> poss = new TreeSet<>();
                poss.add('1');
                poss.add('2');
                poss.add('3');
                if (i + 1 < arr.length)
                    poss.remove(arr[i + 1]);
                if (i - 1 >= 0)
                    poss.remove(arr[i - 1]);

                arr[i] = poss.first();
            }
        }
        System.out.println(arr);
        return new String(arr);
    }

}
