package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaPayment {

    @FindBy(css = ".cheque")
    WebElement btnBycheck;

    @FindBy(xpath = "//p//button[@type='submit']")
    WebElement btnConfiCompra;
    /*

     //Acertamos el banner de orden completa
        WebElement bannerStroreIsComplete = firefoxDriver.findElement(By.className("alert"));

        //si se muestra en la pantalla
        Assert.assertTrue(bannerStroreIsComplete.isDisplayed());
     */

    @FindBy(className = "alert")
    WebElement bannerStroreIsComplete;

    public void pagoConCheck(){
        btnBycheck.click();
    }
    public void confirmarCompra(){
        btnConfiCompra.click();
    }
    public boolean resultOrden(String mensaje){
        System.out.println(mensaje);
        System.out.println(bannerStroreIsComplete.getText());//ontiene el elemento
        return mensaje.equals(bannerStroreIsComplete.getText());
    }
    public void pausa() throws InterruptedException {
        //para que pare, ver el reultado final
        Thread.sleep(40000);
    }


    public PaginaPayment(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
