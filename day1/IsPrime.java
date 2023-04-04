package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int test=17;
		int flag=0;
		int check=0;
		if (test<2)
		{
			System.out.println(test+" is not a prime no");
		}
		else
		{
			for(int i=2;i<=test;i++)
			{
				if(test%i==0) 
				{
					
					flag++;
				
				}
			}	
				if(flag<2)
				{
					System.out.println(test+" is a prime no");
				}
				else {
					System.out.println(test+" is not a prime no");
				}
		}
		
	}
	
}
