package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver d = new ChromeDriver();
		
		d.get("https://testautomationpractice.blogspot.com/");
		d.manage().window().maximize();
		
		//select specific check box
		//d.findElement(By.xpath("//input[@id='tuesday']")).click();
		
		//select all check boxes
		List<WebElement> checkboxes = d.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));        //common selector
		
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		*/
		 /*for(WebElement checkbox:checkboxes)
		 {
			 checkbox.click();
		 }
		 */
		
	    //select last 3 check boxes: total no of checkboxes-how many w want select =starting index
		/*for(int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		*/
		//select first 3 check boxes
		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		Thread.sleep(5000);
		//unselect if they r select
		/*for(int i=0;i<3;i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
				
		}
		*/
		
		
		
		
		
		
		
		 
		

	}

}
