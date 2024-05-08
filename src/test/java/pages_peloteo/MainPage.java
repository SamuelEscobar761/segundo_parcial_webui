package peloteo.pages_peloteo;

import org.openqa.selenium.By;
import peloteo.controls.Button;

public class MainPage {
    public Button searchButton = new Button(By.xpath("//button[text()='Buscar']"));
}
