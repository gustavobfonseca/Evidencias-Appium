package org.example;

import io.appium.java_client.AppiumDriver;
import junit.framework.TestCase;
import org.example.PageObjects.EsqueciMinhaSenha;
import org.example.PageObjects.Home;
import org.example.PageObjects.Login;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class FeatureLogin
        extends TestCase
{
    @Test
public void login_com_usuario_bloqueado() throws InterruptedException {
    AppiumDriver driver =  AppiumDriverConfig.Instance().driver;

    Login telaLogin = new Login(driver);

        telaLogin.buscarElementos();
        telaLogin.preencherFormulario("73040542559", "Devires@123");
        telaLogin.logar();
        telaLogin.buscarMensagemContaBloqueada();
        Assert.assertTrue(telaLogin.getTextoModalContaBloqueada().isDisplayed());
        assertTrue( true );
    }
}

