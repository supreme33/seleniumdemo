package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class demo2 {
	@Test
	public void Testcase1() throws InterruptedException{
		WebDriver d1=new FirefoxDriver();
		d1.get("http:\\www.google.com");
		d1.findElement(By.className("gb_P")).click();
		d1.findElement(By.className("hero_home__link__desktop")).click();
		Thread.sleep(2000);
		d1.quit();
	}
	

}
