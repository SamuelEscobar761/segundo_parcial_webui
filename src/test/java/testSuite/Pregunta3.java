package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class Pregunta3 extends TestBase{
    @Test
    public void CrearUsuario() throws InterruptedException {
        String name = "Samuel Matias Escobar Bejarano";
        String email = "samueb8@gmail.com";
        String password = "1234";
        String nameProject = new Date().getTime()+"UPB";
        mainPage.registerButton.click();
        registerSection.fullNameTextbox.clearSetText(name);
        registerSection.emailTextbox.clearSetText(email);
        registerSection.passwordTextbox.clearSetText(password);
        registerSection.checkboxTerms.click();
        registerSection.submitButton.click();
        Thread.sleep(1000);
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR no se pudo registrar al usuario");
        leftSection.addNewProjectButton.click();
        leftSection.nameProjectTextBox.setText(nameProject);
        leftSection.addButton.click();
        Thread.sleep(1000);
        Assertions.assertEquals(nameProject, centerSection.projectNameLabel.getText(),
                "ERROR! El project no fue creado");
    }

}
