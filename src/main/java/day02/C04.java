package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        driver.navigate().to("https://www.amazon.com");
        // get ile ayni islevi yapar

        // yeniden amazon'a donelim
        driver.navigate().back();
        driver.navigate().forward();
    }
}
