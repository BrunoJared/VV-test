package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class VVTest {
    private WebDriver navegador;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/User/Desktop/Java/Drivers/chromedriver");

    }
    @Test
    public void abrir() {


        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        navegador.get("https://bit.ly/3jOMrR9");
        navegador.findElement(By.xpath("//*[@id=\"menu-item-226\"]")).click();
        navegador.findElement(By.xpath("//*[@id=\"nf-field-5\"]")).sendKeys("Bruno Jared Evangelista da");
        navegador.findElement(By.xpath("//*[@id=\"nf-field-6\"]")).sendKeys("Cruz");
        navegador.findElement(By.xpath("//*[@id=\"nf-field-7\"]")).sendKeys("brunojared7@gmail.com");
        navegador.findElement(By.xpath("//*[@id=\"nf-field-8\"]")).sendKeys("brunojared7@gmail.com");
        navegador.findElement(By.xpath("//*[@id=\"nf-field-17\"]")).sendKeys("(11)99371-1417");
        navegador.findElement(By.xpath("//*[@id=\"nf-label-class-field-10-1\"]")).click();
        navegador.findElement(By.xpath("//*[@id=\"nf-field-11-wrap\"]/div[2]/div")).click();
        navegador.findElement(By.xpath("//*[@id=\"nf-field-12-wrap\"]/div[2]/div")).click();
        navegador.findElement(By.xpath("//*[@id=\"nf-label-class-field-13-4\"]")).click();
        navegador.findElement(By.xpath("//*[@id=\"nf-field-14\"]")).sendKeys("java");
        navegador.findElement(By.xpath("//*[@id=\"nf-field-15\"]")).sendKeys("Quero me tornar uma referência técnica onde eu trabalhar ");

        navegador.findElement(By.xpath("//*[@id=\"nf-field-16\"]")).click();



    }
    @After
    public void fechar() {

        navegador.close();
    }
}

