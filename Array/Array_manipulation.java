
//question: https://www.hackerrank.com/challenges/crush/problem?h_l=interview&h_r=next-challenge&h_v=zen&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=arrays&isFullScreen=true
//Main logic Prefix sum property
//solution 
static long arrayManipulation(int n, int[][] queries) {
              
    long arr[]=new long[n+2];
    for(int i=0;i<queries.length;i++)
    {
        arr[queries[i][0]-1]+=queries[i][2];
        arr[queries[i][1]]+=(-queries[i][2]);
    }
    long max=arr[0];
    for(int i=1;i<arr.length;i++)
    {
         
        arr[i]=arr[i]+arr[i-1];
        if(arr[i]>max)
        {
            max=arr[i];
        }
    }
    return max;
    }
