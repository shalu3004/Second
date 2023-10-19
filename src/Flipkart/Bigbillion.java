package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bigbillion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\codin\\eclipse-workspace\\Second\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();

	}

}
