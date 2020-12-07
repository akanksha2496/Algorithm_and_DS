Leaderboard
You are given a list of integers nums, representing the number of chess matches each person has won. Return a relative ranking (0-indexed) of each person. If two players have won the same amount, their ranking should be the same.

Constraints

n ≤ 100,000 where n is the length of nums
Example 1
Input
nums = [50, 30, 50, 90, 10]
Output
[1, 2, 1, 0, 3]



import java.util.*;

class Solution {
public int[] solve(int[] nums) {
Map<Integer, Integer> hm = new HashMap<>();
int[] arr = Arrays.copyOf(nums, nums.length);
Arrays.sort(arr);

    int rank=0;
    for(int i=arr.length-1;i>=0;i--) {
        if(!hm.containsKey(arr[i])) {
            hm.put(arr[i], rank++);
        }
    }
    
    for(int i=0;i<nums.length;i++) {
        nums[i] = hm.get(nums[i]);
    }
    return nums;
}
}

