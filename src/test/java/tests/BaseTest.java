package tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import pages.CalculatorPage;

@Listeners({TestListener.class})
public class BaseTest {
    private CalculatorPage calculatorPage = new CalculatorPage();

    @BeforeSuite
    public void messageSuite() {
        System.out.println("Вы запустили сьют");
    }

    @BeforeMethod
    public void messageStartMethod(){
        System.out.println("Метод запущен");
    }

    @AfterMethod
    public void messageEndMethod(){
        System.out.println("Метод выполнился");
    }

}
