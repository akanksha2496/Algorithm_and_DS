
class GFG {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    while(t>0){
    	    int len=s.nextInt();
    	    int[] arrivals=new int[len];
    	    int[] departures=new int[len];
    	    for(int i=0;i<len;i++)
    	        arrivals[i]=s.nextInt();
            for(int i=0;i<len;i++)
    	        departures[i]=s.nextInt();
    		Arrays.sort(arrivals);
            Arrays.sort(departures);
            int plat=1;
		    int i=1;
		    int j=0;
		    int ans=1;
		    
		    while(i<len && j<len){
		        if(arrivals[i]<departures[j]){
		            plat++;
		            ans=Math.max(ans,plat);
		            i++;
		        }
		        else{
		            
		            plat--;
		            j++;
		        }
		        //min++;
		    }
            System.out.println(ans);
            t--;
	    }
	}
}

/*
400 900 940 2400 
420 940 950 2000
*/
