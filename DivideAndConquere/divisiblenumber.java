Divisible Numbers
You are given integers n, a, b, and c. Return the nth (0-indexed) term of the sorted sequence of integers divisible by a, b or c.

Note that by convention the first term of any sequence always starts with 1.

Example 1
Input
n = 8
a = 2
b = 5
c = 7
Output
12
Explanation
The first 9 terms of the sequence are [1, 2, 4, 5, 6, 7, 8, 10, 12]




class Solution {
public int solve(int n, int a, int b, int c) {
int l = 1, h = Integer.MAX_VALUE, mid;
while(l<h) {
mid = l + (h-l)/2;
if(check(a,b,c,mid)<n) {
l = mid + 1;
}
else {
h = mid;
}
}
return l;
}

public int lcm(int a, int b) {
    return (a*b)/gcd(a,b);
}

public int gcd(int a, int b) {
    if(a==0)
      return b;
    
    return gcd(b%a, a);
}

public int check(int a, int b, int c, int mid){
    
    return (
            (mid/a) + (mid/b) + (mid/c) - 
            (mid/lcm(a,b)) - 
            (mid/lcm(b,c)) - 
            (mid/lcm(a,c)) + 
            (mid/lcm(a,lcm(b,c)))
             );
}
}
