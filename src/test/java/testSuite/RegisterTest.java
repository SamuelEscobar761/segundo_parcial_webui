package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class RegisterTest extends TestBasePeloteo {
    @Test
    public void respuesta() throws InterruptedException {
        String name = getRandomString(6);
        String lastanme = getRandomString(6);
        String email = getRandomString(8) + "8@gmail.com";
        String password = getRandomString(8);
        String phone = "77587417";
        String searchButtonText = "Buscar";
        loginPage.registerButton.click();
        registerPage.nameTextBox.clearSetText(name);
        registerPage.lastnameTextBox.clearSetText(lastanme);
        registerPage.emailTextBox.clearSetText(email);
        registerPage.passwordTextBox.clearSetText(password);
        registerPage.phoneTextBox.clearSetText(phone);
        registerPage.registerButton.click();
        Thread.sleep(1000);
        Assertions.assertEquals(searchButtonText, mainPage.searchButton.getText(),
                "ERROR! No se registro la cuenta correctamente");
    }

}
