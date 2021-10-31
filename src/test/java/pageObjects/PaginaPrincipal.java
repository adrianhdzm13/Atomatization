package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaPrincipal {
    @FindBy(className  = "login")
    private WebElement botonInicio;
/*
    //T-shirts
    WebElement tShirts = firefoxDriver.findElement(By.xpath("//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[contains(text(),\"T-shirts\")]"));
        tShirts.click();
*/

    @FindBy(xpath = "//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[contains(text(),\"T-shirts\")]")
    private WebElement etiquetaTShirts;


    //metodo parra ir al inicio de sesión
    public  void inicio(){
        botonInicio.click();
    }

    public void irCategoriaTshirt(){
        etiquetaTShirts.click();
    }

    public PaginaPrincipal(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
