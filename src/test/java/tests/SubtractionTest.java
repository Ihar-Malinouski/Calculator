package tests;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.CalculatorPage;

public class SubtractionTest extends BaseTest{

    private CalculatorPage calculatorPage = new CalculatorPage();

    @Test(dataProvider = "valid integer values for subtractuon", dataProviderClass = TestDataProvider.TestDataProviderForSubtractuon.class, groups = {"Smoke", "Regression"},
            description = "Проверка функции вычитания с целочисленными значениями")
    public void additionByIntegerTest(int firstNumber, int secondNumber, int expectedResault) {
        Assert.assertEquals(expectedResault, calculatorPage.subtractionOfNumbers(firstNumber, secondNumber));
    }

    @Parameters({"firstNumberSub", "secondNumberSub", "actualResultSub"})
    @Test(groups = {"Parametrs"}, description = "Проверка функции вычитания с целочисленными значениями из файла Parametrs.xml")
    public void additionByIntegerInParametrsTest(@Optional("1") int firstNumberSub, @Optional("1") int secondNumberSub, @Optional("0") int actualResultSub) {
        Assert.assertEquals(actualResultSub, calculatorPage.subtractionOfNumbers(firstNumberSub, secondNumberSub));
    }

    @Test(description = "Проверка вычитания с невалидными значениями (запрещенные символы)", invocationCount = 3, threadPoolSize = 1, groups = {"Critical"},
            dataProvider = "invalid expected result", dataProviderClass = TestDataProvider.InvalidTestDivision.class)
    public void invalidDivisionByIntegerTest(int firstNumber, int secondNumber, int expectedResault) {
        Assert.assertEquals(expectedResault, calculatorPage.subtractionOfNumbers(firstNumber, secondNumber));
    }
}
