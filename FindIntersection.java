package week2.day2assignment;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []num1= {10,45,54,35,40};
		int []num2= {23,32,56,10,40};
		for (int i = 0; i <= num1.length-1; i++) {
			for (int j = 0; j <= num2.length-1; j++) {
				if(num1[i]==num2[j]) 
					System.out.println(num1[i]);	
			}
		}
	}
}
			
			
		
		

	


