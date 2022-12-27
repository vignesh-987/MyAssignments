package week5.day2assign;

public interface TestTool extends Language {
	void java();
	public void Selenium();
	abstract class MultipleLanguage implements TestTool{
		public void java() {
			// TODO Auto-generated method stub
			System.out.println("java is an object oriented programming");
		}
		public void Selenium() {
			// TODO Auto-generated method stub
			System.out.println("selenium can automate web based application");
		}
		public void python() {
			System.out.println("python is simplest coding language");
		}
		public abstract void ruby();
	}
}
