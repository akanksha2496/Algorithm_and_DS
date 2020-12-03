Que:
Given two strings s0 and s1, return the two strings interleaved, starting with s0. If there are leftover characters in a string they should be added to the end.

Constraints

n ≤ 100,000 where n is the length of s0
m ≤ 100,000 where n is the length of s1



Example 1
Input
s0 = "abc"
s1 = "xyz"
Output
"axbycz"


Note:
##Stringbuilders are faster in java



import java.util.*;


class Solution {
    public String solve(String s0, String s1) {
        StringBuilder str = new StringBuilder("");

        int i = 0;

        while (i < s0.length() && i < s1.length()) {
            str.append(s0.charAt(i));
            str.append(s1.charAt(i++));
        }

        if (i >= s0.length())
            str.append(s1.substring(i));
        else
            str.append(s0.substring(i));

        return str.toString();
    }
}
