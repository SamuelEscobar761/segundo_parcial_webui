package session;

import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class SessionTodoist {
    private static SessionTodoist session;
    private WebDriver browser;
    private SessionTodoist(){
        browser = FactoryBrowser.make("chrome").create();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
    }
    public static SessionTodoist getInstance(){
        if (session == null)
            session = new SessionTodoist();
        return session;
    }

    public WebDriver getBrowser() {
        return browser;
    }

    public void closeSession(){
        browser.quit();
        session = null;
    }
}
