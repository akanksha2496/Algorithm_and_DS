package k_largest_element_from_an_array;

public class k_largest {

   static void build_heap(int[] a,int k)
   {
	   for(int i=(int) Math.ceil(k/2)-1;i>k;i--)
	   {
		   heapify(a,i,k);
	   }
   }
   private static void heapify(int[] a, int i,int k) {
	// TODO Auto-generated method stub
	int l=2*i+1;
	int r=2*i+2;
	int min=a[i],index=i;
	if(l<k && a[l]<min)
	{
		min=a[l];
		index=l;
	}
	if(r<k && a[r]<min)
	{
		 min=a[r];
		 index=r;
	}
	if(index!=i)
	{
		int temp=a[i];
		a[i]=a[index];
		a[index]=temp;
		heapify(a,index,k);
	}
}
  
public static void main(String ar[])
   {
	   int[] a= {6,4,7,9,4,10};
	   int k=3;
	   build_heap(a,k);
	   for(int i=k;i<a.length;i++)
	   {
		   if(a[i]>a[0])
		   {
			   int temp=a[i];
				a[i]=a[0];
				a[0]=temp;
				heapify(a,0,k);
				
		   }
	   }
	   for(int i=0;i<a.length;i++)
		   System.out.println(a[i]);
	   
	   
   }
}
