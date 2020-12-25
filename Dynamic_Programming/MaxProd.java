https://www.youtube.com/watch?v=keVevSvaDKo

152. Maximum Product Subarray
Medium

5811

194

Add to List

Share
Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.

Example 1:

Input: [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.



class Solution {
    public int maxProduct(int[] nums) {
       if(nums.length==1)
           return nums[0];
        int maxp=nums[0],minp=nums[0],choice1,choice2,ans=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            choice1=maxp*nums[i];
            choice2=minp*nums[i];
            maxp=Math.max(nums[i],Math.max(choice1,choice2));
            minp=Math.min(nums[i],Math.min(choice1,choice2));
            ans=Math.max(ans,maxp);
        }
        return ans;
    }
}

