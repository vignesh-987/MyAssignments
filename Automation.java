package week5.day2assign;
import week5.day2assign.TestTool.MultipleLanguage;
public class Automation extends MultipleLanguage implements TestTool,Language{
	public static void main(String[] args) {
		Automation obj=new Automation();
		obj.java();
		obj.Selenium();
		obj.python();
		obj.ruby();
		
	}
@Override
public void java() {
// TODO Auto-generated method stub
System.out.println("java");
}
@Override
public void Selenium() {
// TODO Auto-generated method stub
System.out.println("Selenium");
}
	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
	}
}

