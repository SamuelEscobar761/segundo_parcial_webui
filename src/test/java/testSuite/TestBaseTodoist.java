package testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pagesTodoist.MainPage;
import session.Session;

public class TestBaseTodoist {
    MainPage mainPage = new MainPage();
    @AfterEach
    public void close(){
        Session.getInstance().closeSession();
    }
    @BeforeEach
    public void open(){
        Session.getInstance().getBrowser().get("https://todoist.com//");
    }
}
