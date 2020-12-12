Fixed Point
Given a list of unique integers nums sorted in ascending order, return the minimum i such that nums[i] == i. If there's no solution, return -1.

This should be done in \mathcal{O}(log(n))O(log(n)) time.

Constraints

n ≤ 100,000 where n is the length of nums
Example 1
Input
nums = [-5, -2, 0, 3, 4]
Output
3
Explanation
Both nums[3] == 3 and nums[4] == 4 but 3 is smaller.

Example 2
Input
nums = [-5, -4, 0]
Output
-1
Explanation
There's no i such that nums[i] = i.


















import java.util.*;

class Solution {
    public int solve(int[] nums) {
        
        if(nums.length==0) return -1;
        
        int l=0, r = nums.length-1;
        
        while(l<r) {
            int m = l + (r-l)/2;
            
            if(nums[m]>=m) {
              r = m;
            }
            else {
                l = m + 1;
            }
            
        }
        
        if(nums[l]==l) return l;
        
        return -1;
    }
}
