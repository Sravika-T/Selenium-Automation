package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("S");
	
		ChromeDriver d = new ChromeDriver();
		//d.get("https://rpachallenge.com/");
		//d.manage().window().maximize();
		//d.findElement(By.linkText("Shortest Path")).click();
		
		d.get("https://artoftesting.com/samplesiteforselenium");
		d.findElement(By.xpath("//input[@type='checkbox'][@class='Automation']")).click();
		
		
	}

}