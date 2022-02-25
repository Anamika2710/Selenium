import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        driver.navigate().to("https://rahulshettyacademy.com/");
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();

	}

}
