package tests;

import  org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalculatorPage;

public class AdditionTest {

    private CalculatorPage calculatorPage = new CalculatorPage();

    @Test
    public void testSum() throws Exception {
        Assert.assertEquals(5, calculatorPage.additionOfNumbers(2,3));

    }
}