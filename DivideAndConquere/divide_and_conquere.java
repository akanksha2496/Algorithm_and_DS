package DivideAndConquere;

class Pair
{
 int min;
 int max;
}

public class divide_and_conquere {

	public static void main(String ar[])
	{
		int[] a= {10,40,30,90,89,60,78,300,20,2,1};
		Pair p=get_minmax(a,0,a.length-1);
		System.out.print("min: "+p.min+" max:"+p.max);
	}
	static private Pair get_minmax(int[] a, int low,int high) {
		// TODO Auto-generated method stub
		Pair p=new Pair();
		if(low==high)
		{
			p.max=p.min=a[low];
			return p;
		}
		if(high==low+1)
		{
			if(a[high]>a[low])
			{
				p.max=a[high];
				p.min=a[low];
			}
			else
			{
				p.min=a[high];
				p.max=a[low];
			}
			return p;
		}
		int mid=(low+high)/2;
		Pair ld=get_minmax(a,low,mid);
        Pair rd=get_minmax(a,mid+1,high);
        if(ld.max>rd.max)
        	p.max=ld.max;
        else
        	p.max=rd.max;
        if(ld.min<rd.min)
        	p.min=ld.min;
        else
        	p.min=rd.min;
		
		return p;
	}
}
