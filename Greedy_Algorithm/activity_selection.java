package activity_selection;



public class activity_selection {
  
	//1.sort acc to finish time;
	public static void main(String ar[])
	{
		int s[] =  {1, 3, 0, 5, 8, 5}; 
	    int f[] =  {2, 4, 6, 7, 9, 9}; 
	    TotalActivity(s,f,s.length-1);
	    
	}

	private static void TotalActivity(int[] s, int[] f, int n) {
		int i, j; 
	       
		int count=1;
	    System.out.print("Following activities are selected : n\n"); 
	    i = 0; 
	    System.out.print(i+" "); 
	   for(j=1;j<n;j++)
	   {
		   if(s[j]>=f[i])
		   {
			   
			   System.out.print(j+" ");
			   count++;
			   i=j;
		   }		        
	   }
	   System.out.print("total activity:  "+count); 
		
	}
	
  
    
}
