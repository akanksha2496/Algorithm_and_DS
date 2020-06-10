package nuts_bolts;
//main concept is to sort 2 array withhout comapring elemnts of its own and sort on the
//basisi of each other.
public class nuts_bolts {

	   public static void main(String[] args) 
	    { 
	        // Nuts and bolts are represented as array of characters 
	        char nuts[] = {'@', '#', '$', '%', '^', '&'}; 
	        char bolts[] = {'$', '%', '&', '^', '@', '#'}; 
	        
	       matchPairs(nuts,bolts,0,nuts.length-1);
	       for(char c:nuts)
	       {
	    	   System.out.print(c);
	       }
	       System.out.println();
	       for(char c:bolts)
	       {
	    	   System.out.print(c);
	       }
	    }

	private static void matchPairs(char[] nuts, char[] bolts, int p, int r) {
		// TODO Auto-generated method stub
		if(p<r)
		{
			//choose pivots of nuts array and arrange them and get index of pivoted nut
			int pivot=partition(nuts,p,r,nuts[r]);
			//after arranging nuts arrange bolts on the basis of nuts pivot;
			partition(bolts,p,r,nuts[pivot]);
			//patition again;
			matchPairs(nuts,bolts,p,pivot-1);
			matchPairs(nuts,bolts,pivot+1,r);
		}
	  
		
	}

	private static int partition(char[] a, int p, int r, char pivot) {
		// TODO Auto-generated method stub
		int i=p;
		char temp;
		int j=p;
		for(;j<r;j++)
		{
			//if pivote is equal to the current element then
			//settle it on the last;
			if(a[j]==pivot)
			{
				temp=a[j];
				a[j]=a[r];
				a[r]=temp;
				j--;
			}
			else if(a[j]<pivot)
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				i++;
			}
		}
		temp=a[j];
		a[j]=a[i];
		a[i]=temp;
		return i;
	} 
}
