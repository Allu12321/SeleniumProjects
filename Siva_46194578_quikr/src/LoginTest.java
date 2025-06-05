import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

public class LoginTest {

    private static Playwright playwright;
    private static Browser browser;
    private static BrowserContext context;
    private static Page page;

    @BeforeAll
    public static void setUp() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        context = browser.newContext();
        page = context.newPage();
    }

    @Test
    public void loginTest() {
        // Navigate to the login page
        page.navigate("https://example.com/login");

        // Enter username
        page.fill("#username", "testUser");

        // Enter password
        page.fill("#password", "testPassword");

        // Click login button
        page.click("#loginButton");

        // Assert successful login
        Assertions.assertTrue(page.isVisible("#dashboard"), "Dashboard should be visible after login");
    }

    @AfterAll
    public static void tearDown() {
        page.close();
        context.close();
        browser.close();
        playwright.close();
    }
}