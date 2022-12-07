package week2.day2assignment;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {12,24,23,32,21,12,19,13,19,10,13,22};
		int size=array.length;
		System.out.println("Duplicate Elements in the Array");
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]==array[j]) {
					System.out.println(array[i]);
				}
			}
		}
	}
}
