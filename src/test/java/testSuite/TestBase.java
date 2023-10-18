package testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.*;
import session.Session;

public class TestBase {
    MenuSection menuSection = new MenuSection();
    MainPage mainPage = new MainPage();

    LeftSection leftSection = new LeftSection();

    CenterSection centerSection = new CenterSection();

    RegisterSection registerSection = new RegisterSection();

    @AfterEach
    public void close(){
        Session.getInstance().closeSession();
    }
    @BeforeEach
    public void open(){
        Session.getInstance().getBrowser().get("http://todo.ly/");
    }
}
