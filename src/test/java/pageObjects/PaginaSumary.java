package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaSumary {

/*
    //Hacemos click en el segundo boton para cerrar compra
    WebElement btnCompra2 = firefoxDriver.findElement(By.xpath("//p//*[contains(text(),'Proceed to checkout')]"));
        btnCompra2.click();
        */
    @FindBy(xpath = "//p//*[contains(text(),'Proceed to checkout')]")
    WebElement btnCompra2;

    public void  clicBtn2(){
        btnCompra2.click();
    }

    public PaginaSumary(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
