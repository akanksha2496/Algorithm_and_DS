Inverse Factorial
The factorial of a number n is defined as n! = n * (n - 1) * (n - 2) * ... * 1.

Given a positive integer a, return n such that n! = a. If there is no integer n that is a factorial, then return -1.

Constraints

n < 2 ** 31
Example 1
Input
a = 6
Output
3
Explanation
3! = 6


















import java.util.*;

class Solution {
    public int solve(int a) {
     ArrayList<Integer> al=new ArrayList<>();
     al.add(1);
     al.add(2);
     if(a==1 || a==2)
     return a;
     for(int i=3;i<=a/2;i++)
     {
         if((al.get(i-2)*i)==a)
         return i;
         else
         al.add(al.get(i-2)*i);
     }
     return -1;
    }
}
