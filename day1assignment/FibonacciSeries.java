package week2.day1assignment;

public class FibonacciSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=8;
		int firstNum=0;
		int secNum=1;
		int sum;
		System.out.println(firstNum);
		for(int i=1;i<range;i++) {
			sum=firstNum+secNum;
			secNum=firstNum;
			firstNum=sum;
			System.out.println(sum);
		}
	}
}
			
	
		
		

	


