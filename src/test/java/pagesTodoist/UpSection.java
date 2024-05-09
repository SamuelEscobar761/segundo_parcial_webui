package pagesTodoist;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class UpSection {
    public Button addTaskButton = new Button(By.xpath("//button[text()='Add task']"));
    public TextBox newTaskTextbox = new TextBox(By.xpath("//p[@data-placeholder=\"Task name\"]"));
    public Button submitNewTaskButton = new Button(By.xpath("//button[@aria-label=\"Add task\"]"));

}
