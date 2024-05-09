package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class LoginTest extends TestBasePeloteo {
    @Test
    public void respuesta() throws InterruptedException {
        String email = "samueb8@gmail.com";
        String password = "12345678";
        String searchButtonText = "Buscar";
        loginPage.emailTextBox.clearSetText(email);
        loginPage.passwordTextBox.clearSetText(email);
        Thread.sleep(1000);
        Assertions.assertEquals(searchButtonText, mainPage.searchButton.getText(),
                "ERROR! No se inició sesión correctamente");
    }

}
