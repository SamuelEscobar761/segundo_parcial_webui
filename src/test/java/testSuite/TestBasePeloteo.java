package peloteo.testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import peloteo.pages_peloteo.*;
import peloteo.session.Session;

public class TestBase {
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    MainPage mainPage = new MainPage();
    UserPage userPage = new UserPage();
    @AfterEach
    public void close() {
        try {
            Session.getInstance().closeSession();
        } catch (Exception e) {
            System.err.println("Error closing browser session: " + e.getMessage());
        }
    }

    @BeforeEach
    public void open() {
        String baseUrl = System.getProperty("baseUrl", "http://www.google.com/");
        Session.getInstance().getBrowser().get(baseUrl);
    }

}
