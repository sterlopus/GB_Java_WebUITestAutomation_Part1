package ru.geekbrains.level3.lession3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App 
{
    public static void main( String[] args ) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driverCh = new ChromeDriver();
        driverCh.get("https://google.com");
        Thread.sleep(3000);
        driverCh.quit();

        WebDriverManager.firefoxdriver().setup();
        WebDriver driverFf = new FirefoxDriver();
        driverFf.get("https://ya.ru");
        Thread.sleep(3000);
        driverFf.quit();
    }
}
