package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Fitpeocode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver d = new ChromeDriver();//To launch the Chrome browser
		d.get("https://fitpeo.com/");//To Navigate to FitPeo URL
		d.manage().window().maximize();//To Maximize the browser
		Thread.sleep(1000);//To wait for 1sec
		
		d.get("https://fitpeo.com/revenue-calculator"); //To Navigate to Revenue calculator page
		d.manage().window().maximize();//To maximize the browser
	    JavascriptExecutor js= (JavascriptExecutor) d;
	    js.executeScript("window.scrollBy(0,350)","");//to Scroll down browser
	    Thread.sleep(1000);//To wait for 1sec
	    
	    //To Locate the input text box element
	  	WebElement e = d.findElement(By.xpath("(//input[@id=':R57alklff9da:'])[1]"));
	  		
	  	e.sendKeys(Keys.CONTROL + "a");//To copy the text
	  	e.sendKeys(Keys.DELETE);//To delete the text
		
	    
		//  To move the slider to a specific value:
		WebElement thumb = d.findElement(By.xpath("//span[contains(@class, 'MuiSlider-root')]//span[contains(@class, 'MuiSlider-thumb')]"));

		//To Perform actions using Actions class, like drag and drop
		
		Actions actions = new Actions(d);
		Thread.sleep(3000);
		
		// To Locate the slider element 
        WebElement slider = d.findElement(By.xpath("//span[contains(@class, 'MuiSlider-root')]"));
        int sliderWidth = slider.getSize().getWidth();  // Get the width of the slider

        // To Print the width of the slider
        System.out.println("The width of the slider is: " + sliderWidth + " pixels.");
        
		actions.clickAndHold(thumb).moveByOffset(124, 0).release().perform(); //To move the slider position
		Thread.sleep(1000);
		
       
		
		e.sendKeys(Keys.CONTROL + "a");//To copy the text
		e.sendKeys(Keys.DELETE);//To delete the text
		e.sendKeys("560");// To give the input to the text
		
		//To Locate the element for CPT boxes
		List<WebElement> boxes = d.findElements(By.cssSelector("div")); 

        
        // Loop through the boxes
        
        for (WebElement box : boxes) {
        	
        	//To Get the required text from the page
            if (box.getText().contains("CPT-99091") || box.getText().contains("CPT-99453") || box.getText().contains("CPT-99454") || box.getText().contains("CPT-99474")) {
                // To Find the checkbox within the current box
                WebElement checkbox = box.findElement(By.cssSelector("input[type='checkbox']"));
                
                // Click the checkbox
                if (!checkbox.isSelected()) {
                    checkbox.click();
                }
                
            }
                
               
            }
        

       //To locate the element for Total Recurring Reimbursement
		WebElement p = d.findElement(By.xpath("//div[@class='MuiBox-root css-m1khva']"));
		String s = p.getText();//To get the text from the page
		System.out.println("Extracted Text:" + s);//Printing the text
		
		if (s.contains("$75600"))//getText contains specified amount
		 {
			System.out.println("true");//Print true
			
		}
		else //getText does not contains specified amount
		{
			System.out.println("false");//Print false
			
		}
		
			
		
		d.quit();//To close the browser
				
		
	}	
	
}