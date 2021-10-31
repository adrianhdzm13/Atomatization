package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaAddress {

    @FindBy(xpath = "//button/span[contains(text(), 'Proceed to checkout')]")
    WebElement btnCompra3;

    public void clicBtnCompra3(){
        btnCompra3.click();
    }

    public PaginaAddress(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
