https://leetcode.com/problems/longest-consecutive-sequence/

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

Follow up: Could you implement the O(n) solution? 

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 

Constraints:

0 <= nums.length <= 104
-109 <= nums[i] <= 109



solution:

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
            hs.add(nums[i]);
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            int j=nums[i];
            if(!hs.contains(j-1))
            {
                while(hs.contains(j))
                {j++;}
                res=Math.max(res,j-nums[i]);
            }
        }
        return res;
    }
}



time: O(n) space : O(n)
