package peloteo.pages_peloteo;

import org.openqa.selenium.By;
import peloteo.controls.TextBox;

public class LoginPage {
    public TextBox emailTextBox = new TextBox(By.id("email"));
    public TextBox passwordTextBox = new TextBox(By.id("password"));
}
