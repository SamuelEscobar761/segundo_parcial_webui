package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class RegisterSection {
    public TextBox fullNameTextbox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public TextBox emailTextbox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox passwordTextbox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public Button checkboxTerms = new Button(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
    public Button submitButton = new Button((By.id("ctl00_MainContent_SignupControl1_ButtonSignup")));
}
