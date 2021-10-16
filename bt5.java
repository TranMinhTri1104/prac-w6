package newproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class bt5 extends bt4 {
    @Test
    public static void VerifyRegister() {
        WebElement w = driver.findElement(By.xpath("//*[@style= 'margin-left:20px;']/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
        w.click();

        List<WebElement> childElements = driver.findElements(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input"));
        for(int i = 0; i<childElements.size();i++) {
            childElements.get(0).sendKeys("Tri");
            childElements.get(1).sendKeys("Tran");
            childElements.get(2).sendKeys("1104");
            childElements.get(3).sendKeys("tranminhtri1104@gmail.com");

            childElements.get(4).sendKeys("1 Nguyen Trai");
            childElements.get(5).sendKeys("TP HCM");
            childElements.get(6).sendKeys("Phuong Nguyen Cu Trinh");
            childElements.get(7).sendKeys("123456");

            childElements.get(8).sendKeys("tri123");
            childElements.get(9).sendKeys("tri321");
            childElements.get(10).sendKeys("tri321");
            break;
        }

        WebElement submit = driver.findElement(By.xpath("//*[@name='submit']"));
        submit.click();

        System.out.print("Create successfully!");
    }
    
    @Test(priority = 1)
	public static void Login() {
		WebElement login = driver.findElement(By.xpath("//*[@face='Arial, Helvetica, sans-serif']/a"));
        login.click();
        List<WebElement> childElements1 = driver.findElements(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input"));
        for(int i = 0; i<childElements1.size();i++) {
            childElements1.get(0).sendKeys("tri123");
            childElements1.get(1).sendKeys("tri321");
            break;
        }

        WebElement submitlogin = driver.findElement(By.xpath("//*[@name='submit']"));
        submitlogin.click();
		}
	}