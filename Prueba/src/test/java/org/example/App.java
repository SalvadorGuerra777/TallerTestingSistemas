package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
{
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("start-maximized");
    chromeOptions.addArguments("--remote-allow-origins=*");
    WebDriverManager.chromedriver().setup();
    WebDriver pdriver = new ChromeDriver(chromeOptions);
    pdriver.get("https://www.saucedemo.com/");

    pdriver.findElement(By.id("user-name")).sendKeys("standard_user");
    pdriver.findElement(By.id("password")).sendKeys("secret_sauce");
    pdriver.findElement(By.id("login-button")).click();
    pdriver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    pdriver.findElement(By.id("shopping_cart_container")).click();
    pdriver.findElement(By.id("checkout")).click();
    pdriver.findElement(By.id("react-burger-menu-btn")).click();
    pdriver.findElement(By.id("logout_sidebar_link")).click();

}
}
