package sorted_rotated;
public class sorted_rotated {

	public static void main(String ar[])
	{
		int[] a= {7,8,9,10,1,2,3,4,5,6};
		int key=0;
		System.out.println("index of key is- "+binarySearchForkey(a,key,0,a.length-1));
	}

	private static int binarySearchForkey(int[] a, int key, int low, int high) {
		// TODO Auto-generated method stub		
		
		System.out.println("low: "+low+ " high: "+high);
		if(low>high)
			return -1;
		int mid=(low+high)/2;
		if(key==a[mid])
		{
			return mid;
		}
		//look in a[low to mid] is that sorted?yes 
		else if(a[low]<=a[mid])
		{
			if(a[low]<=key && a[mid]>=key)
			{
				return binarySearchForkey(a,key,low,mid);
			}
			else
			{
				return binarySearchForkey(a,key,mid+1,high);
			}
		}
		if(a[mid]<=key && a[high]>=key)
			{
				return binarySearchForkey(a,key,mid,high);
			}
		return binarySearchForkey(a,key,low,mid-1);
		}
	
	
}
