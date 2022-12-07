package week2.day2assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,3,5,6,7,8,9,10};
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			if(array[i]!=i+1) {
				System.out.println(array[i]-1);
				break;
			}
			}
		}
	}
