package Prueba;

import org.junit.Assert;
import org.junit.Test;

public class Compra extends BaseTest {

    @Test

    public void realizarCompra() throws InterruptedException {
        
        paginaPrincipal.inicio();
        paginaLogin.login("Adrianhdzm13@gmail.com", "SANmateo*123");
        paginaPrincipal.irCategoriaTshirt();
        paginaCategoryTshirt.comprarTshirt();
        paginaSumary.clicBtn2();
        paginaAddress.clicBtnCompra3();
        paginaShipping.finalizarCompra();
        paginaPayment.pagoConCheck();
        paginaPayment.confirmarCompra();
        Assert.assertTrue(paginaPayment.resultOrden("Your order on My Store is complete."));
        paginaPayment.pausa();
    }


}
