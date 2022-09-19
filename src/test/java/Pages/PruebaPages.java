package Pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PruebaPages extends BaseDriver {

    String TXT_CONTRASENA = "Loquequieraponer2020";
    String TXT_NOMBRE = "Lucho";
    String TXT_APELLIDO = "Ramirez";
    String TXT_USERNAME = "ramirezlucho005";



    public void launchBrowse() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");

    }
    public void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }




    public void EscribirNombre() {
        WebElement nombre = driver.findElement(By.id("firstName"));
        nombre.sendKeys(TXT_NOMBRE);

    }


    public void EscribirApellidos() {
        WebElement apellido = driver.findElement(By.id("lastName"));
        apellido.sendKeys(TXT_APELLIDO);

    }



    public void EscribirUsername() {
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys(TXT_USERNAME);


    }


    public void EscribirPasswd() {
        WebElement password = driver.findElement(By.name("Passwd"));
        password.sendKeys(TXT_CONTRASENA);

    }



    public void Confirmpasswd() {
        WebElement Cpassword = driver.findElement(By.name("ConfirmPasswd"));
        Cpassword.sendKeys(TXT_CONTRASENA);

    }


    public void checkbox() {

        WebElement chk = driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe"));
        chk.click();
    }



    public void InteractuarSiguiente ()  {

        WebElement BTN = driver.findElement(By.id("accountDetailsNext"));
        BTN.click();


    }
    public void EscribirUsernames(String usernames) {
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys(usernames);


    }

    public void ValidarPass (String pass,String Rpass) {
        WebElement password = driver.findElement(By.name("Passwd"));
        WebElement Cpassword = driver.findElement(By.name("ConfirmPasswd"));
        password.sendKeys(pass);
        Cpassword.sendKeys(Rpass);


    }




}


