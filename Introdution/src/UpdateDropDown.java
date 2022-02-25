import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
        Thread.sleep(2000L);
        Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
       
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
        
        //Count number of checkboxes
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
        
        
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        for(int i=1;i<5;i++)
        	driver.findElement(By.id("hrefIncAdt")).click();

        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
