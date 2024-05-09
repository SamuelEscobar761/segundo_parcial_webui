package pagesTodoist;

import controls.TextBox;
import org.openqa.selenium.By;

public class LoginPageTodoist {

    public TextBox fullNameTextbox = new TextBox(By.xpath("//input[@type=\"email\"]"));
    public TextBox password = new TextBox(By.xpath("//input[@type=\"password\"]"));
    public TextBox submit = new TextBox(By.xpath("//input[@text()=\"Log in\"]"));

}
