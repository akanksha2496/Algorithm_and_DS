
//https://www.javatpoint.com/Comparator-interface-in-collection-framework#:~:text=Java%20Comparator%20interface,and%20equals(Object%20element).


//max time O(n2) and min O(nlog n)
package job_selected;
import java.util.Comparator;
import java.util.Arrays;


//inputs of all the jobs
class Job{
   int job;
   int deadline;
   int penaulty;
   Job(int start,int deadline,int profit)
   {
       this.job= start;
       this.deadline = deadline;
       this.penaulty=profit;

	    }
	    
	}
class PeanaultyComparator implements Comparator<Job>{
	 
	//sort in decrsing order;
	 public int compare(Job o1,Job o2)
	 {
		 if(o1.penaulty>=o2.penaulty)
		 {
			 return -1;
		 }
		 else
			 return 1;
	 }
	 
}
class OptimalScheduleWithMinimumPenaulty
 {
  //1.sort weight by decresing porder of profit;
	    public int maximum(Job[] jobs){
	        
	        //comparator lga h tki on the basis of deadlines sort kar pae;
	        PeanaultyComparator comparator = new PeanaultyComparator();
	        Arrays.sort(jobs,comparator);
//	        for(int i=0;i<jobs.length;i++)
//	        	System.out.print(jobs[i].penaulty+" ");
	        
	        int max=0;
	        
	        for(int i=0;i<jobs.length;i++)
	        {
	        	if(max<jobs[i].deadline)
	        	{
	        		max=jobs[i].deadline;
	        	}
	        }
	        boolean slot[]=new boolean[max];
	        int T[] = new int[max];
	        System.out.print(max+" "+"\n");
	        for(int i=0;i<jobs.length;i++)
	        {
	        	for(int j=jobs[i].deadline-1;j>=0;j--)
	        	{
	        		if(slot[j]==false)
	        		{
	        			slot[j]=true;
	        			
	        			T[j]=jobs[i].penaulty;
	        			 System.out.println("job  no: "+jobs[i].job);
	        			break;
	        		}
	        	}
	        }
	       int total_penaulty=0;
	       for(int i=0;i<T.length;i++)
	       {
	    	  System.out.print(T[i]+" ");
	    	   total_penaulty+=T[i];
	       }
	       int sub_total_penaulty=0;
	       for(int i=0;i<jobs.length;i++)
	       {
	    	  sub_total_penaulty+=jobs[i].penaulty;
	       }
           
	       //for maximum profit
	        return total_penaulty;
	    }
	  
 }




public class job_select {
 
	public static void main(String ar[])
	{
		    Job  jobs[]= new Job[9];
	        jobs[0] = new Job(1,5,25);
	        jobs[1] = new Job(2,7,40);
	        jobs[2] = new Job(3,4,50);
	        jobs[3] = new Job(4,3,15);
	        jobs[4] = new Job(5,1,70);
	        jobs[5] = new Job(6,5,35);
	        jobs[6] = new Job(7,2,90);
	        jobs[7] = new Job(8,4,55);
	        jobs[8] = new Job(9,3,45);
	        OptimalScheduleWithMinimumPenaulty mp = new OptimalScheduleWithMinimumPenaulty();
	        System.out.println("\n"+mp.maximum(jobs));
	}

}
