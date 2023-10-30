import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
        Thread.sleep(2000);
        WebElement login_fieldTxt = driver.findElement(By.id("login_field"));
        if(login_fieldTxt.isDisplayed()){
            if (login_fieldTxt.isEnabled()){


            login_fieldTxt.sendKeys("saianuraag.m");
            String enteredText = login_fieldTxt.getAttribute("value");
            System.out.println(enteredText);// if want to send other text first clear and then sendkeys
            login_fieldTxt.clear();
            login_fieldTxt.sendKeys("saianuraag.m@gmail.com");
        }else {
            System.err.println("Username text box not enabled");
        }
        }else System.err.println("Username text box is not displayed");
    }
}
