package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int test=17;
		int flag=0;
		int check=test/2;
		if (test<2)
		{
			System.out.println(test+" is not a prime no");
		}
		else
		{
			for(int i=2;i<=check;i++)
			{
				if(test%i==0) 
				{
					System.out.println(test+" is not a prime no");
					flag=1;
					break;
				}
			}	
				if(flag==0)
				{
					System.out.println(test+" is a prime no");
				}
			
		}
	}
	
}
