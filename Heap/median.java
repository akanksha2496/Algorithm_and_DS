package median;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

//put condition that max heap should always 1 greater then min heap tabhi uska beech ka
//element nikal paenge odd size hone pe.
//refer ravindra babau ka lecture ones elese ye yaad
//rakhna hai ki maxheap--lower hai
//minheap upper hai
//or odd length pr max ka top nikalre isliye max ka size min se ek bada hona chiye
public class median {
	
    private static PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder()); // keeps track of the SMALL numbers
    private static PriorityQueue<Integer> minHeap = new PriorityQueue(); 
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
 		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
 		for(int i=0;i<n;i++)
 		{
 			makeHeapForMedian(a[i]);
 			System.out.println("median till now:: "+findcurrentMedian());
 		}
	}

	private static void makeHeapForMedian(int n) {
		// TODO Auto-generated method stub
		if(maxHeap.isEmpty())
		{
			maxHeap.add(n);
		}
		else if(minHeap.size()==maxHeap.size())
		{
			
			if(minHeap.peek()>n)
			{
				maxHeap.add(n);
			}
			else
			{
				minHeap.add(n);
				maxHeap.add(minHeap.remove());
			}	
			
		}
		else if(maxHeap.size()>minHeap.size())
		{
			if(maxHeap.peek()<n)
			{
				minHeap.add(n);
			}
			else 
			{
				maxHeap.add(n);
				minHeap.add(maxHeap.remove());
			}
		}
	}

	private static double findcurrentMedian() {
		// TODO Auto-generated method stub
		if(maxHeap.isEmpty()==true)
		{
			return 0;
		}
		else if(maxHeap.size()==minHeap.size())
		{
			return (maxHeap.peek()+minHeap.peek())/2.0;
		}
		else
		{
			return maxHeap.peek();
		}
		
	}

}