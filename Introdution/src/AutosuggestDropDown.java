import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("Ind");
        Thread.sleep(3000);
        List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for(WebElement choice :options)
        {
        	if(choice.getText().equalsIgnoreCase("India"))
        	{
        		choice.click();
        	}
        }

	}

}
