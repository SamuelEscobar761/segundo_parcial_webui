package testSuite;

import org.junit.jupiter.api.Test;

public class Pregunta4 extends TestBaseTodoist{
    @Test
    public void respuesta(){
        mainPage.loginButton.click();
        loginPage.fullNameTextbox.clearSetText("samueb8@gmail.com");
        loginPage.password.clearSetText("SamuelCambio/1234");
        loginPage.submit.click();

    }

}
