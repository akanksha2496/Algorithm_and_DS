package inversion;
public class inversion {

	static int count=0;
	public static void main(String ar[])
	{
		int[] a= {1, 20, 6, 4, 5};
		merge_Sort(a,0,a.length-1);
		System.out.print(count);
	}
	private static void merge_Sort(int[] a,int p,int r) {
		// TODO Auto-generated method stub
		int q;
		if(p<r)
		{
			q=(p+r)/2;
			merge_Sort(a,p,q);
			merge_Sort(a,q+1,r);
			merge(a,p,q,r);
		}
	}
	private static void merge(int[] a, int p, int q, int r) {
		// TODO Auto-generated method stub
		int n1=q-p+1;
		int n2=r-q;
		int[] left=new int[n1];
		int[] right=new int[n2];

		for(int i=0;i<n1;i++)
		{
			System.out.println("n1: "+i);
			left[i]=a[i+p];
		}
		for(int i=0;i<n2;i++)
		{
			System.out.println("n2: "+i);
			right[i]=a[q+i+1];
		}
		int i=0,j=0,k=p;
		while(i<n1 && j<n2)
		{
			if(left[i]<=right[j])
			{
				a[k++]=left[i++];
			}
			else
			{
				//only here is the differenvce is 
				//agar 5,6,7 left me hai or 1,2,3 right me hai
				//to length of left-current position of i jo ki left k index
				//vo sare count krke add kr denge 
				//thrn sorted order me array me change krte janege 
				//or count badhate jaega;
				count+=(n1-i);
				a[k++]=right[j++];
			}
		}
		while(i<n1)
		{
			a[k++]=left[i++];
		}
		while(j<n2)
		{
			a[k++]=right[j++];
		}
		
		
		
		
	}
}
