package selenium;

import java.util.List;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import javax.swing.JOptionPane;
//import java.util.Scanner;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver d = new ChromeDriver();
		//d.get("https://fitpeo.com/");
		d.get("https://fitpeo.com/revenue-calculator");
		d.manage().window().maximize();
	    JavascriptExecutor js= (JavascriptExecutor) d;
	    js.executeScript("window.scrollBy(0,-350)","");
	    
	    //Thread.sleep(10000);
		
	    WebElement e = d.findElement(By.xpath("(//input[@id=':R57alklff9da:'])[1]"));
		
		//String v = e.getAttribute("value");
		//System.out.println(v);
		//e.click();
		//e.clear();
		e.sendKeys(Keys.CONTROL + "a");
		e.sendKeys(Keys.DELETE);
		e.sendKeys("560");
		// For example, to move the slider to a specific value:
		WebElement thumb = d.findElement(By.xpath("//span[contains(@class, 'MuiSlider-root')]//span[contains(@class, 'MuiSlider-thumb')]"));

		// Perform actions using Actions class, like drag and drop
		e.sendKeys(Keys.CONTROL + "a");
		e.sendKeys(Keys.DELETE);
		Actions actions = new Actions(d);
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//int f = 2000/20;
		//System.out.print(f);
		   // Get the width of the slider
		// Locate the slider element (use the correct XPath or CSS selector)
        WebElement slider = d.findElement(By.xpath("//span[contains(@class, 'MuiSlider-root')]"));
        int sliderWidth = slider.getSize().getWidth();  // Get the width of the slider

        // Print the width of the slider
        System.out.println("The width of the slider is: " + sliderWidth + " pixels.");
		actions.clickAndHold(thumb).moveByOffset(123, 0).release().perform();  
		//List<WebElement> checkboxes = d.findElements(By.xpath("//input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
		List<WebElement> checkboxes = d.findElements(By.cssSelector("label[class='MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd inter css-1ml0yeg']"));
		for(int i=0;i<checkboxes.size();i++)
		{
			String value= checkboxes.get(i).getText();
			//checkboxes.get(i).click();
			if (value.equals("57") || value.equals("19.19") || value.equals("63") || value.equals("15"))
			{
				checkboxes.get(i).click();
			}
				
			
			   
			
		}
		WebElement p = d.findElement(By.xpath("//div[@class='MuiBox-root css-m1khva']"));
		String s = p.getText();
		System.out.println("Extracted Text:" + s);
		JOptionPane.showMessageDialog(null, "Extracted Text: " + s);
		if (s.contains("$110160"))
		{
			System.out.println("true");
			
		}
		else
		{
			System.out.println("false");
			
		}
		
			
		
		//d.quit();
				
		//d.findElement(By.xpath("//span[normalize-space()='57']")).click();
		//d.findElement(By.xpath("//span[normalize-space()='19.19']")).click();
		//d.findElement(By.xpath("//span[normalize-space()='63']")).click();
		//d.findElement(By.xpath("//span[normalize-space()='15']")).click();
		
		 
		   
		
		
		
		
		
		
		//Actions actions = new Actions(d);
		//WebElement element = d.findElement(By.xpath("//input[@id=':R57alklff9da:']"));
		//((JavascriptExecutor) d).executeScript("arguments[0].value='10';",element);
		//actions.moveToElement(element).click().sendKeys("6").perform();
		
		//WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id=':R57alklff9da:']")));
		//element.sendKeys("7");

	}

	private static By ByClassName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
