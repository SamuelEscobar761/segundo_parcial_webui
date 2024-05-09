package pages_peloteo;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class RegisterPage {
    public TextBox nameTextBox = new TextBox(By.id("name"));
    public TextBox lastnameTextBox = new TextBox(By.id("lastname"));
    public TextBox emailTextBox = new TextBox(By.id("email"));
    public TextBox passwordTextBox = new TextBox(By.id("password"));
    public TextBox phoneTextBox = new TextBox(By.id("phone"));
    public Button registerButton = new Button(By.xpath("//a[contains(@href, '/home')]"));
}
