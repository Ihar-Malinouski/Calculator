package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.CalculatorPage;

public class DivisionTest extends BaseTest {

    private CalculatorPage calculatorPage = new CalculatorPage();

    @Test(dataProvider = "valid integer values for division", dataProviderClass = TestDataProvider.TestDataProviderForDivision.class, groups = {"Smoke", "Regression"},
            description = "Проверка функции деления с целочисленными значениями")
    public void divisionByIntegerTest(int firstNumber, int secondNumber, int expectedResault) {
        Assert.assertEquals(expectedResault, calculatorPage.divisionOfNumbers(firstNumber, secondNumber));
    }

    @Parameters({"firstNumberDiv", "secondNumberDiv", "actualResultDiv"})
    @Test(groups = {"Parametrs"}, description = "Проверка функции деления с целочисленными значениями из файла Parametrs.xml")
    public void divisionByIntegerInParametrsTest(@Optional("1") int firstNumberDiv, @Optional("1") int secondNumberDiv, @Optional("1") int actualResultDiv) {
        Assert.assertEquals(actualResultDiv, calculatorPage.divisionOfNumbers(firstNumberDiv, secondNumberDiv));
    }

    @Test(description = "Проверка деления с невалидными значениями (запрещенные символы)", invocationCount = 3, threadPoolSize = 3, groups = {"Critical"},
            dataProvider = "invalid expected result", dataProviderClass = TestDataProvider.InvalidTestDivision.class)
    public void invalidDivisionByIntegerTest(int firstNumber, int secondNumber, int expectedResault) {
        Assert.assertEquals(expectedResault, calculatorPage.divisionOfNumbers(firstNumber, secondNumber));
    }

    @Ignore("Игнорим тест, пока в науке не разрешат делить на ноль")
    @Test(enabled = true)
    public void divisionByZeroTest() {
        Assert.assertEquals(-1, calculatorPage.divisionOfNumbers(2, 0));
    }

    @Test(dataProvider = "valid integer values for division", dataProviderClass = TestDataProvider.TestDataProviderForDivision.class, retryAnalyzer = Retry.class, groups = {"Regression"})
    public void validDivisionByIntegerTest(@Optional int firstNumber, int secondNumber, int actualResult) {
        Assert.assertEquals(actualResult, calculatorPage.divisionOfNumbers(firstNumber, secondNumber));
    }
}
