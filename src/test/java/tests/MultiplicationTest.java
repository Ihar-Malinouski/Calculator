package tests;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.CalculatorPage;

public class MultiplicationTest extends BaseTest {

    private CalculatorPage calculatorPage = new CalculatorPage();

    @Test(dataProvider = "valid integer values for multiplication", dataProviderClass = TestDataProvider.TestDataProviderForMultiplication.class, groups = {"Smoke", "Regression"},
            description = "Проверка функции умножения с целочисленными значениями")
    public void additionByIntegerTest(int firstNumber, int secondNumber, int expectedResault) {
        Assert.assertEquals(expectedResault, calculatorPage.multiplicationOfNumbers(firstNumber, secondNumber));
    }

    @Parameters({"firstNumberMul", "secondNumberMul", "actualResultMul"})
    @Test(groups = {"Parametrs"}, description = "Проверка функции умножения с целочисленными значениями из файла Parametrs.xml")
    public void additionByIntegerInParametrsTest(@Optional("1") int firstNumberMul, @Optional("1") int secondNumberMul, @Optional("1") int actualResultMul) {
        Assert.assertEquals(actualResultMul, calculatorPage.multiplicationOfNumbers(firstNumberMul, secondNumberMul));
    }

    @Test(description = "Проверка умножения с невалидными значениями (запрещенные символы)", invocationCount = 5, threadPoolSize = 1, groups = {"Critical"},
            dataProvider = "invalid expected result", dataProviderClass = TestDataProvider.InvalidTestDivision.class)
    public void invalidDivisionByIntegerTest(int firstNumber, int secondNumber, int expectedResault) {
        Assert.assertEquals(expectedResault, calculatorPage.divisionOfNumbers(firstNumber, secondNumber));
    }
}
