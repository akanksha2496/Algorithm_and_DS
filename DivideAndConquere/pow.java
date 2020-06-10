package pow;
public class pow {

	public static void main(String ar[])
	{
		int n=3;
		int x=12;
		System.out.print(pow_cal(n,x));
	}

	private static double pow_cal(int n,int x) {
		// TODO Auto-generated method stub
		if(x==0)
			return 1;
		double temp=pow_cal(n,x/2);
		if(x%2==1)
			return temp*temp*n;
		else
			return temp*temp;
	}
}
