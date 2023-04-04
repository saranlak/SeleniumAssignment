package week1.day1;

public class Fibbinocci {
public static void main(String[] args) {
	
	int firstNum=0;
	int secNum=1;
	int sum=0;
	int incrementer=1;
	
	while(incrementer<11)
	{
		System.out.println(sum);
		sum=firstNum+secNum;
		firstNum=secNum;
		secNum=sum;
		incrementer++;
		
	}
	}

}
