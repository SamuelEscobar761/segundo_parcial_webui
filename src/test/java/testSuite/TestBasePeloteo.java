package testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages_peloteo.*;
import session.Session;

import java.nio.charset.Charset;
import java.util.Random;

public class TestBasePeloteo {
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    MainPage mainPage = new MainPage();
    UserPage userPage = new UserPage();

    public static String getRandomString(int i) {
        // bind the length
        byte[] bytearray;
        bytearray = new byte[256];
        String mystring;
        StringBuffer thebuffer;
        String theAlphaNumericS;

        new Random().nextBytes(bytearray);

        mystring = new String(bytearray, Charset.forName("UTF-8"));

        thebuffer = new StringBuffer();

        // remove all spacial char
        theAlphaNumericS = mystring.replaceAll("[^A-Z0-9]", "");

        // random selection
        for (int m = 0; m < theAlphaNumericS.length(); m++) {
            if (Character.isLetter(theAlphaNumericS.charAt(m)) && (i > 0)
                    || Character.isDigit(theAlphaNumericS.charAt(m)) && (i > 0)) {
                thebuffer.append(theAlphaNumericS.charAt(m));
                i--;
            }
        }

        // the resulting string
        return thebuffer.toString();
    }
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
        String baseUrl = System.getProperty("baseUrl", "http://localhost:5173/");
        Session.getInstance().getBrowser().get(baseUrl);
    }

}
