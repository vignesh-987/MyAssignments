package week6.day4.ass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateNewIncident {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	//Launch ServiceNow application
	driver.get("https://dev117051.service-now.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	// Login with valid credentials
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//label[text()='User name']/following::input")).sendKeys("admin");
	driver.findElement(By.xpath("//label[text()='Password']/following::input")).sendKeys("V9yJV=jz3Q^i");
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	driver.switchTo().defaultContent();
	//Click -All and  Enter Incident in filter navigator and press enter
	driver.findElement(By.id("filter")).sendKeys("Incident");
	driver.findElement(By.xpath("(//div[@class='sn-widget-list_v2 sn-widget-list_dense']/following::div[text()='Create New'])[1]")).click();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//button[@id='lookup.incident.caller_id']/span")).click();
	driver.switchTo().defaultContent();
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> windowHandles1=new ArrayList<String>(windowHandles);
	driver.switchTo().window(windowHandles1.get(1));
	driver.findElement(By.linkText("Abel Tuter")).click();
	Set<String> windowHandles2 = driver.getWindowHandles();
	List<String> windowHandles3=new ArrayList<String>(windowHandles);
	driver.switchTo().window(windowHandles1.get(0));
	driver.switchTo().frame(0);
	driver.findElement(By.id("lookup.incident.short_description")).click();
	driver.switchTo().defaultContent();
	Set<String> windowHandles4 = driver.getWindowHandles();
	List<String> windowHandles5=new ArrayList<String>(windowHandles4);
	driver.switchTo().window(windowHandles5.get(1));
	driver.findElement(By.linkText("Issue with a web page")).click();
	Set<String> windowHandles6 = driver.getWindowHandles();
	List<String> windowHandles7=new ArrayList<String>(windowHandles6);
	driver.switchTo().window(windowHandles7.get(0));
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	WebElement search = driver.findElement(By.className("form-control"));
	Select selectfid=new Select(search);
	selectfid.selectByVisibleText("Number");
	WebElement searchbox = driver.findElement(By.xpath("(//span[text()='Press Enter from within the input to submit the search.']/following::input)[1]"));
	searchbox.sendKeys("INC0010138");
	searchbox.sendKeys(Keys.ENTER);
	
	
	
}
}
