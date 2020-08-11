import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mySS {

	public static void main(String[] args) {
		WebDriver myDriver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sshaikh\\Desktop\\Selenium\\W1_Jan_2020\\Drivers\\chromedriver.exe");
		myDriver = new ChromeDriver();
		myDriver.manage().window().maximize();

	}

}
