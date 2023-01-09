package week6.day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		List<WebElement> language = driver.findElements(By.xpath("//table[@class='ui-selectmanycheckbox ui-widget']//tr//td/div"));
for (int i = 1; i <= language.size(); i++) {
	driver.findElement(By.xpath("//table[@class='ui-selectmanycheckbox ui-widget']//tr[1]//td["+i+"]/div/following::label")).click();
	
}
driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']")).click();
  List<WebElement> selectMultiple = driver.findElements(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']/ul/li[1]/div[1]/following::label"));
for (int j = 1; j <=selectMultiple.size(); j++) {
	driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']/ul/li[1]/div[1]/following::label["+j+"]")).click();
	
}

	}

}
