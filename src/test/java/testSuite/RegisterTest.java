package peloteo.testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import peloteo.testSuite.TestBase;

import java.util.Date;

public class RegisterTest extends TestBase {
    @Test
    public void respuesta() throws InterruptedException {
        String name = "Samuel Matias Escobar Bejarano";
        String email = "samueb8@gmail.com";
        String password = "1234";
        String nameProject = new Date().getTime()+"UPB";
        Thread.sleep(1000);
        Assertions.assertEquals(nameProject,mainPage.searchButton.getText(),
                "ERROR! El project no fue creado");
    }

}
