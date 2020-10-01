import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage {
    WebDriver wd;
    HomePage hp;

    @Test
    public void testChrome(){
        wd = new ChromeDriver();
        hp = new HomePage();
    }
}
