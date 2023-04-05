package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		
	 int[] fstArray= {3,2,11,4,6,7};
	int[] sndArray= {1,2,8,4,9,7};
	
	for(int i=0; i<fstArray.length; i++)
	{
		for(int j=0;j<sndArray.length;j++)
		{
			if(fstArray[i]==sndArray[j])
			{
				System.out.println(fstArray[i]);
			}
		}
		
	}
	
	
	}
}
