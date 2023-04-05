package week1.day2;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		
		for (int i=0;i<arr.length-1;i++)
		{
			int flag=0;
			int j=i+1;
			if(j==arr[i])
			{
				flag=1;
			}
			
			if(flag!=1)
				System.out.println(j+" is missing no");
		}
		
	}

}
