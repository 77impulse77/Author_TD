import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class AuthorAdd {

    private WebDriver driver;

    @BeforeAll
    static void enableDriver(){
   //     System.setProperty("webdriver.chrome.driver", "src/main/resources//chromedriver.exe");
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void setupDriver(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @DisplayName("Auth")
    @Test
    void auth(){
        driver.get("https://author.today/");
        new WebDriverWait(driver, Duration.ofSeconds(10));

    }


    @AfterEach
    void exitDriver(){
        if (driver != null){
            driver.quit();
        }
    }

}
