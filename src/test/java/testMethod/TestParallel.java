///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
// */
//package testMethod;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import static org.testng.Assert.*;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
///**
// *
// * @author Admin
// */
//public class TestParallel {
//    
//    //DDT
//    @DataProvider(name = "initData", parallel = true)
//    public Object[][] initData() {
//        return new Object[][]{
//            {"admin", "1", "Toi la admin"},
//            {"hoaiphuong2506", "hoaiphuong2506", "PP"}
//        };
//    }
//
//    @Test(dataProvider = "initData")
//    public void loginTest(String userID, String password, String fullName) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver = new ChromeDriver();
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
//        WebElement txtFullname = driver.findElement(By.cssSelector("body h1 b"));
//
//        Thread.sleep(3000);
//
//        assertEquals(fullName, txtFullname.getText());
//        driver.quit();
//
//    }
//    
//}
