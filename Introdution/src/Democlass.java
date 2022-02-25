import org.openqa.selenium.chrome.ChromeDriver;

public class Democlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
         ChromeDriver driver= new ChromeDriver();
         driver.get("https://rahulshettyacademy.com/");
         System.out.println(driver.getTitle());
         System.out.println(driver.getCurrentUrl());
         driver.quit();
         
	}

}
