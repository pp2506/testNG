package testMethod;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setUpClass() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

//    @DataProvider(name = "initDataWrongPassword")
//    public static Object[][] initDataWrongPassword() {
//        return new Object[][]{
//            {"admin", "12", "Toi la admin"},};
//    }
//
//    @Test(dataProvider = "initDataWrongPassword")
//    public void loginTestWrongPassword(String userID, String password, String fullName) throws InterruptedException {
//        driver.get("http://localhost:8080/testPRJ/");
//
//        WebElement txtUsername = driver.findElement(By.xpath("//input[@name='userID']"));
//        txtUsername.sendKeys(userID);
//
//        WebElement txtPassword = driver.findElement(By.cssSelector("input[name='password']"));
//        txtPassword.sendKeys(password);
//
//        WebElement btnLogin = driver.findElement(By.name("action"));
//        btnLogin.click();
//
//        Thread.sleep(3000);
//
//        WebElement errorElement = driver.findElement(By.cssSelector("body h1"));
//
//        if (errorElement.isDisplayed()) {
//            // If the error message element is displayed, check the error message
//            assertEquals("Incorrect userID or password", errorElement.getText());
//        } else {
//            // If no error message is displayed, check the full name element
//            WebElement txtFullname = driver.findElement(By.cssSelector("body h1 b"));
//            assertEquals(fullName, txtFullname.getText());
//        }
//    }
//
//    //TDD
//    @Test()
//    public void searchSuccess() throws InterruptedException {
//        driver.get("http://localhost:8080/testPRJ/");
//        WebElement txtUsername = driver.findElement(By.xpath("//input[@name='userID']"));
//        txtUsername.sendKeys("admin");
//
//        WebElement txtPassword = driver.findElement(By.cssSelector("input[name='password']"));
//        txtPassword.sendKeys("1");
//
//        WebElement btnLogin = driver.findElement(By.name("action"));
//        btnLogin.click();
//
//        String search = "h";
//
//        WebElement searchBox = driver.findElement(By.cssSelector("form[action='MainController'] input[name='search']"));
//        searchBox.sendKeys(search);
//
//        WebElement btnSearch = driver.findElement(By.cssSelector("input[value='Search']"));
//        btnSearch.click();
//
//        WebElement table = driver.findElement(By.xpath("(//table)[1]"));
//        List<WebElement> rows = table.findElements(By.tagName("tr"));
//
//        boolean searchTextFound = false;
//
//        for (WebElement row : rows) {
//            List<WebElement> cells = row.findElements(By.tagName("td"));
//            for (WebElement cell : cells) {
//                String cellText = cell.getText().trim();
//                if (cellText.toLowerCase().contains(search.toLowerCase())) {
//                    searchTextFound = true;
//                    break;
//                }
//            }
//            if (searchTextFound) {
//                break;
//            }
//        }
//        Thread.sleep(3000);
//
//        assertTrue(searchTextFound, "Search text not found in the table");
//    }
    
    @DataProvider(name = "initDatacreateUserSuccess")
    public static Object[][] initDatacreateUserSuccess() {
        return new Object[][]{
            {"SE11112", "PDinhhh", "1", "1"},};
    }

    @Test(dataProvider = "initDatacreateUserSuccess")
    public void createUserSuccess(String userid, String fullname, String password, String comfirm) throws InterruptedException {
        driver.get("http://localhost:8080/testPRJ/");
        WebElement txtcreate = driver.findElement(By.xpath("//a[normalize-space()='Click here']"));
        txtcreate.click();

        WebElement txtuserID = driver.findElement(By.xpath("//input[@name='userID']"));
        txtuserID.sendKeys(userid);

        WebElement txtfullname = driver.findElement(By.xpath("//input[@name='fullName']"));
        txtfullname.sendKeys(fullname);

        WebElement txtpass = driver.findElement(By.xpath("//input[@name='password']"));
        txtpass.sendKeys(password);

        WebElement txtcomfirm = driver.findElement(By.xpath("//input[@name='confirm']"));
        txtcomfirm.sendKeys(comfirm);

        WebElement btncreate = driver.findElement(By.xpath("//input[@name='action']"));
        btncreate.click();

        WebElement txtloginuserID = driver.findElement(By.xpath("//input[@name='userID']"));
        txtloginuserID.sendKeys(userid);

        WebElement txtloginpass = driver.findElement(By.xpath("//input[@name='password']"));
        txtloginpass.sendKeys(password);

        WebElement txtlogins = driver.findElement(By.xpath("//input[@name='action']"));
        txtlogins.click();

        Thread.sleep(3000);
        
        WebElement txtfullNameTake = driver.findElement(By.xpath("//div[@class='h']"));

        assertEquals(txtfullNameTake.getText(),"Full Name: "+ fullname);
    }
    @AfterClass
    public static void tearDownClass() throws InterruptedException {
        driver.quit();
    }

}
