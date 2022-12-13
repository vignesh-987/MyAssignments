package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class LaunchChromeBrowser {
	public static void main(String[] args) {
		//to open chrome browser
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
		//load the application url
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//enter the username as democsr
		driver.findElement(By.id("username")).sendKeys("Democsr");
		//enterthe password as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crmsfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click Leads Label
		driver.findElement(By.linkText("Leads")).click();
		//click Create Lead
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("P");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("vicky");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("tester");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("software tester");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("600000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("354628");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I hvae the knowledge of manual testing");
	
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("kumar");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("electrical");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("40");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$@*");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("hello sir");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("462");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vignesh.pg01@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9003893172");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("rajan");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.facebook.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("victor");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("sankarankovil");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("627754");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("64");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("ravi");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("tirunelveli");
		//click on Create Lead Button
		driver.findElement(By.name("submitButton")).click();
		
		
	}
	

}
