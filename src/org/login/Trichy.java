package org.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trichy {
	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.Driver", "C:\\Users\\keerthi\\eclipse-workspace\\Keerthi1\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://twitter.com/i/flow/login");
	}

}
