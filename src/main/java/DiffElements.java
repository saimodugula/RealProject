import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiffElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        driver.findElement(By.id("femalerb")).click();
        driver.findElement(By.id("englishchbx")).click();
        WebElement chbx = driver.findElement(By.id("hindichbx"));
        chbx.click();
        Thread.sleep(3000);
        if(chbx.isSelected())
            chbx.click();
        driver.findElement(By.id("registerbtn")).click();
        driver.findElement(By.id("msg")).getText(); // to get text of a label
        driver.findElement(By.linkText("Click here to navigate to the home page")).click();

    }
}
