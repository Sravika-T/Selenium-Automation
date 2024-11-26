package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/javascript_alerts");
		

		//Normal alert with OK button
		//d.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		//d.switchTo().alert().accept();//single operation
		//Alert a = d.switchTo().alert();//multiple operations
		//System.out.println(a.getText());//can capture the text of the alert window
		//a.accept();
		
		//confirmation Alert-Ok and Cancel button
		//d.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		//d.switchTo().alert().accept();  //close alert ok button
		//d.switchTo().alert().dismiss();    //close alert cancel button
		
		//Prompt alert with input box along with ok and cancel--------------//(using explicit wait type also handle alerts)
		d.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		Alert a = d.switchTo().alert();
		a.sendKeys("HI");
		a.accept();
		
		//autenticated popup-pass username& pass inside the url-http://isername:password@url
		

	}

}
