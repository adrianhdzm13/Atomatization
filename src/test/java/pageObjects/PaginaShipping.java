package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaShipping {

    @FindBy(css = "#cgv")
    WebElement checbox;

    @FindBy(xpath = "//button[@name='processCarrier']")
    WebElement btnCompra4;

    public  void  finalizarCompra(){
        checbox.click();
        btnCompra4.click();
    }
    public PaginaShipping(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
