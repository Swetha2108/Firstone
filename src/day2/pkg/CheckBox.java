package day2.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		WebElement checkbox1= driver.findElement(By.xpath("//input[1]"));
		WebElement checkbox2= driver.findElement(By.xpath("//input[2]"));
		System.out.println("checkbox1.Selected()");
		checkbox1.click();
		System.out.println("checkbox1.Selected()");
		if(!checkbox2.isSelected())
		{
			checkbox2.click();
		}
		
		

	}

}
