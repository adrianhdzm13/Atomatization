package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaLogin {

    @FindBy(css = "#email")
    WebElement  inputEmail;

    @FindBy(css = "#passwd")
    WebElement inputPassword;

    @FindBy(css = "#SubmitLogin")
    WebElement botonIniciar;

    //separar acciones
    private void llenarInputEmail(String email){
        inputEmail.sendKeys(email);
    }

    private void llenarInputPasswd(String password){
        inputPassword.sendKeys(password);
    }

    private void clicIngresar(){
        botonIniciar.click();
    }

    public void login(String email, String password){
        llenarInputEmail(email);
        llenarInputPasswd(password);
        clicIngresar();
    }

    //constructor
    public  PaginaLogin(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
