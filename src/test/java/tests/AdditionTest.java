package tests;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.CalculatorPage;

public class AdditionTest extends BaseTest {

    private CalculatorPage calculatorPage = new CalculatorPage();

    @Test(dataProvider = "valid integer values for addition", dataProviderClass = TestDataProvider.TestDataProviderForAddition.class, groups = {"Smoke", "Regression"},
            description = "Проверка функции сложения с целочисленными значениями")
    public void additionByIntegerTest(int firstNumber, int secondNumber, int expectedResault) {
        Assert.assertEquals(expectedResault, calculatorPage.additionOfNumbers(firstNumber, secondNumber));
    }

    @Parameters({"firstNumberAdd", "secondNumberAdd", "actualResultAdd"})
    @Test(groups = {"Parametrs"}, description = "Проверка функции сложения с целочисленными значениями из файла Parametrs.xml")
    public void additionByIntegerInParametrsTest(@Optional("1") int firstNumberAdd, @Optional("1") int secondNumberAdd, @Optional("2") int actualResultAdd) {
        Assert.assertEquals(actualResultAdd, calculatorPage.additionOfNumbers(firstNumberAdd, secondNumberAdd));
    }

    @Test(description = "Проверка сложения с невалидными значениями (запрещенные символы)", invocationCount = 3, threadPoolSize = 1, groups = {"Critical"},
            dataProvider = "invalid expected result", dataProviderClass = TestDataProvider.InvalidTestDivision.class)
    public void invalidDivisionByIntegerTest(int firstNumber, int secondNumber, int expectedResault) {
        Assert.assertEquals(expectedResault, calculatorPage.additionOfNumbers(firstNumber, secondNumber));
    }
}