package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		d.get("https://ui.vision/demo/webtest/frames/");
		//3 methods 1.frame(name),(id),(WebElement) and also index
		WebElement f = d.findElement(By.xpath("//frame[@src='frame_1.html']"));
		d.switchTo().frame(f);  //passed frame as a webelemnt
		d.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hi");
		
		d.switchTo().defaultContent();//go back to page
		//Frame2
		WebElement f2 = d.findElement(By.xpath("//frame[@src='frame_2.html']"));
		d.switchTo().frame(f2);
		d.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Hello");
		
		d.switchTo().defaultContent();//go back to page
		
		//Frame3
		
		WebElement f3 = d.findElement(By.xpath("//frame[@src='frame_3.html']"));
		d.switchTo().frame(f3);
		
		d.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Haa");
		
		//inner iframe
		d.switchTo().frame(0); // switching to frame using index
		

	}

}
