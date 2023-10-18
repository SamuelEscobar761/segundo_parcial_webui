package testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pagesTodoist.LoginPageTodoist;
import pagesTodoist.MainPage;
import pagesTodoist.UpSection;
import session.Session;

public class TestBaseTodoist {
    MainPage mainPage = new MainPage();
    LoginPageTodoist loginPage = new LoginPageTodoist();
    UpSection upSection = new UpSection();
    @AfterEach
    public void close(){
        Session.getInstance().closeSession();
    }
    @BeforeEach
    public void open(){
        Session.getInstance().getBrowser().get("https://todoist.com//");
    }
}
