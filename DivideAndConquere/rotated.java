Find the Largest Number in a Rotated List
You are given a list of unique integers nums that is sorted in ascending order and is rotated at some pivot point. Find the maximum number in the rotated list.

Can you do it in \mathcal{O}(\log{}n)O(logn)?

Constraints

n ≤ 100,000 where n is the length of nums.
Example 1
Input
arr = [6, 7, 8, 1, 4]
Output
8
Explanation
The original sorted array of [1, 4, 6, 7, 8] was rotated at index 2 and results in the input array [6, 7, 8, 1, 4,]. And the largest number is 8.

Example 2
Input
arr = [1, 2, 3]
Output
3
Example 3
Input
arr = [1]
Output
1
Example 4
Input
arr = [10, 1, 2, 3, 4, 7]
Output
10
























I/P=arr[]:6 7 8 1 4
0 1 2 3 4

low = 0
high = 4

while(0<4)
mid = 2;

if(8>4)
low = 3;

while(3<4)
mid = 3;
if(1>4)
high = 3

while(3<3)

return arr[3-1]

I/P=arr[]:1 4 6 7 8
0 1 2 3 4
while(0<4)
mid = 2;
if(6>8)
high = 2;

while(0<2)
mid = 1;
if(4>6)
high = 1;

while(0<1)








class Solution {
public int solve(int[] arr) {
int n = arr.length;
int low = 0;
int high = arr.length - 1;

    while (low < high) {
        int mid = (low + high) / 2;

        if (arr[mid] > arr[high]) {
            low = mid + 1;
        } else
            high = mid;
    }
    if (low == 0)
        return arr[n - 1];
    return arr[low - 1];

}
}
