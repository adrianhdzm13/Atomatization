package Prueba;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import pageObjects.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver firefoxDriver;

        PaginaPrincipal paginaPrincipal;
        PaginaLogin  paginaLogin;
        PaginaCategoryTshirt paginaCategoryTshirt;
        PaginaSumary paginaSumary;
        PaginaAddress paginaAddress;
        PaginaShipping paginaShipping;
        PaginaPayment paginaPayment;

        private void inicializarPagina(WebDriver driver){
            paginaPrincipal = new PaginaPrincipal(driver);
            paginaLogin = new PaginaLogin(driver);
            paginaCategoryTshirt = new PaginaCategoryTshirt(driver);
            paginaSumary = new PaginaSumary(driver);
            paginaAddress = new PaginaAddress(driver);
            paginaShipping = new PaginaShipping(driver);
            paginaPayment =  new PaginaPayment(driver);
        }

    @Before
    public void driver(){
        //busca el archivo .exe gecko.driver
        System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\geckodriver.exe");

        //opciones para el driver
        FirefoxOptions options = new FirefoxOptions();
        options.setCapability( "marionette", true);

        //instancia nueva
        firefoxDriver = new FirefoxDriver(options);

        //tiempo de espera
        firefoxDriver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);
        inicializarPagina(firefoxDriver);

        //URL
        firefoxDriver.get("http://automationpractice.com/index.php");

    }//fin driver

    @After
    public  void finDriver(){
        //Cerrar window... fin driver
        firefoxDriver.quit();
    }

}
