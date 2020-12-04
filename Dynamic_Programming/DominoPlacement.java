que 
Domino Placement
You are given integers n and m representing a board of size n by m. You also have an unlimited number of 1 by 2 dominos.

Return the maximum number of dominos that can be placed on the board such that they don't overlap and every domino lies entirely within the board.

Example 1
Input
n = 2
m = 2
Output
2

logic:

[][][][]
[][][][]
[][][][]
[][][][]

4 by 4



[][][]
[][][]
[][][]
[][][]

4 by 3











solution:

import java.util.*;

class Solution {
    public int solve(int n, int m) {
        int x=0;
        if(m%2==1)
        {m=m-1;
         x=n;
        }
        return n*(m/2)+Math.floor(x/2);
    }
}
