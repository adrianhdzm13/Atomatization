package pageObjects;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaCategoryTshirt {
    WebDriver driver;

    @FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
    WebElement imagenCompra;

    @FindBy(css = ".ajax_add_to_cart_button.btn.btn-default")
    WebElement btnAgregarCarro;

    public void comprarTshirt(){
        Actions accion = new Actions(this.driver);
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("window.scrollBy(0,500)");
        accion.moveToElement(imagenCompra).moveToElement(btnAgregarCarro).click().build().perform();

        //Hacemos click en el primer boton para cerrar compra
        WebDriverWait wait = new WebDriverWait(this.driver, 10);
        WebElement botonCompra1;
        botonCompra1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Proceed to checkout')]")));
        botonCompra1.click();


    }

    public PaginaCategoryTshirt(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
