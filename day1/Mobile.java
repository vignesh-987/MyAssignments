package week1.day1;


public class Mobile {
	String mobileBrandName="Iphone";
	char mobileLogo='I';
	short noOfMobilePiece=4;
	long mobileimeiNumber=31523656897897l;
	int modelNumber=264863447;
	float mobilePrice=1000000.00f;
	boolean isDamaged=false;
	
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		System.out.println("mobileBrandName "+mob.mobileBrandName);
		System.out.println("mobileLogo "+mob.mobileLogo);
		System.out.println("noOfMobilePrice "+mob.noOfMobilePiece);
		System.out.println("mobileimeiNumber "+mob.mobileimeiNumber);
		System.out.println("modelNumber "+mob.modelNumber);
		System.out.println("mobilePrice "+mob.mobilePrice);
		System.out.println("isDamaged "+mob.isDamaged);
}
}