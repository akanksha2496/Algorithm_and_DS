package missing;
public class missing {

	public static void main(String ar[])
	{
		int[] a= {0,20,30,40,50};
		int d=(a[a.length-1]-a[0])/(a.length+1-1);
		System.out.print(find_missing_index(a,0,a.length-1,d,a[0],a[0]));
	}

	private static int find_missing_index(int[] x, int low, int high,int d,int a,int Tn) {
		// TODO Auto-generated method stub
		
		    if(high<low)
		    {
		    	return Tn;
		    }
		    int mid=(low+high)/2;
		    Tn=a+(mid+1-1)*d;
			
		    System.out.println(" Tn: "+Tn+" mid:  "+x[mid]+" left: "+low+" right: "+high);
		    
		    if(Tn==x[mid])
		    {
		    	return find_missing_index(x,mid+1,high,d,a,Tn);
		    }
		    else if(Tn<x[mid])
		    {
		    	return find_missing_index(x,low,mid-1,d,a,Tn);
		    }	
		    return mid;
	}
}
