package Testes;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTeste {
    @Test
    public void testFazerLofinNoTaskIt(){

        System.setProperty("webdriver.chrome.driver","/users/murilodeoliveira/drivers/chromedriver");
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://pnb-varejo-cms.herokuapp.com/");
        navegador.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        navegador.findElement(By.id("user_email")).sendKeys("admin@kanamobi.com.br");
        navegador.findElement((By.id("user_password"))).sendKeys("KanaAdmin");
        navegador.findElement(By.name("commit")).click();


        //String saudacao = navegador.findElement(By.xpath("//div[@class='card-body']/h4")).getText();

        String saudacao = navegador.findElement(By.cssSelector("div[class=card-body] h4")).getText();

        //System.out.println(saudacao);
        //garente a saudacao
        assertEquals("Olá, Super Admin",saudacao);

        //navegador.findElement()


    }


}
