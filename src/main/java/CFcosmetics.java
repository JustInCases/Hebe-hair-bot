import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class CFcosmetics {
public static void main(String[] args){

    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("window-position=2000,0");
    ChromeDriver driver = new ChromeDriver(options);
    driver.manage().window().maximize();

    //opening website using webdriver
    driver.get("https://www.hebe.pl/");

    //closing first add
    WebElement add = driver.findElement(By.cssSelector("div[class='p-15'] a picture img"));
    add.click();

    //closing automatically opened sign in window
    WebElement closeadd = driver.findElement(By.className("ui-modal__close"));
    closeadd.click();

    //clicking destination menu
    WebElement hairmenu = driver.findElement(By.xpath("//span[contains(text(),'Włosy')]"));
    hairmenu.click();

    //closing message about delivery
    WebElement freedostawa = driver.findElement(By.cssSelector("i[class='fa fa-times js-disposable-slot-hide']"));
    freedostawa.click();

    //accepting cookies
    WebElement cookies = driver.findElement(By.cssSelector("div.ppmb__button:nth-child(2) > button"));
    cookies.click();

    //Activating dropdown list with brands to choose
    WebElement brand = driver.findElement(By.cssSelector("span[class='ui-expandable__header refinement__title refinement-brand__title']"));
    brand.click();

    //cselecting brands
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    WebElement anwen = driver.findElementByXPath("//a[@title='Filtruj po:Anwen']");
    anwen.click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    WebElement bandi = driver.findElementByCssSelector("a[title='Filtruj po:Bandi'] i");
    bandi.click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    WebElement gosh = driver.findElementByCssSelector("a[title='Filtruj po:Gosh'] i");
    gosh.click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    WebElement lirene = driver.findElementByCssSelector("a[title='Filtruj po:Lirene'] i");
    lirene.click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    WebElement nacomi = driver.findElementByCssSelector("a[title='Filtruj po:Nacomi'] i");
    nacomi.click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    WebElement onlybio = driver.findElementByCssSelector("a[title='Filtruj po:Only Bio'] i");
    onlybio.click();
    try {
        Thread.sleep(1500);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    WebElement orientana = driver.findElementByCssSelector("a[title='Filtruj po:Orientana'] i");
    orientana.click();
    try {
        Thread.sleep(1500);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    WebElement tolpa = driver.findElementByCssSelector("a[title='Filtruj po:Tołpa'] i");
    tolpa.click();
    try {
        Thread.sleep(1500);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    WebElement yope = driver.findElementByCssSelector("a[title='Filtruj po:Yope'] i");
    yope.click();

    }
}
