package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		//d.get("https://www.selenium.dev/downloads/");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("Balu");
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");

		System.out.println("Pass or Fail");
		
	}

}
