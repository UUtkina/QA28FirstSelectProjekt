import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementHome {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        //maximize browser to window
        driver.manage().window().maximize();
        //wait for all elements on the page to load before starting the test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void findElementByTagTest() {
        //find element by tag
        WebElement element = driver.findElement(By.tagName("label"));
        System.out.println("===========1==============");
        System.out.println(element.getAttribute("textContent"));

        List<WebElement> elements1 = driver.findElements(By.tagName("a"));
        System.out.println("===========2==============");
        System.out.println(elements1.size());


    }
    @Test
    public void findElementByTest() {
        //id
        WebElement element = driver.findElement(By.id("bar-notification"));
        System.out.println("===========3==============");
        System.out.println(element.getSize()); //1519 — это ширина элемента в пикселях.
                                               // 29 — это высота элемента в пикселях.

        WebElement element1 = driver.findElement(By.className("account"));
        System.out.println("===========4==============");
        System.out.println(element1.getText());

        WebElement keywords = driver.findElement(By.name("keywords"));////head/meta[3]
        System.out.println("===========5==============");
        System.out.println(keywords.getSize());

        WebElement books = driver.findElement(By.linkText("Books"));
        System.out.println("===========6==============");
        System.out.println(books.getText());
        System.out.println(books.getSize());

    }
    @Test
    public void findElementByCssSelectorTest() {
        driver.findElement(By.cssSelector("title"));
    }

    @Test
    public void findElementByXpathTest() {
        WebElement element = driver.findElement(By.xpath("//a[contains(@href,'computers')]"));
        System.out.println("===========7==============");
        System.out.println(element.getAttribute("href"));

        WebElement element1 = driver.findElement(By.xpath("//*[@class='top-menu-triangle']"));
        System.out.println("===========8==============");
        System.out.println(element1.getAttribute("top-menu-triangle"));

        WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit' and contains(@class, 'search-box-button')]"));
        WebElement searchButton1 = driver.findElement(By.xpath("//input[@type='submit' and @value='Search']"));
        System.out.println("===========9==============");
        System.out.println(searchButton.getSize());
        System.out.println(searchButton1.getSize());

        WebElement element2 = driver.findElement(By.xpath("//label[contains(.,'Last name')]"));
        System.out.println("===========10==============");
        System.out.println(element2.getSize());

    }

}

