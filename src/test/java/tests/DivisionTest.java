package tests;

import   org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalculatorPage;

public class DivisionTest {

    private CalculatorPage calculatorPage = new CalculatorPage();

    @Test
    public void testDiv() throws Exception {
        Assert.assertEquals(-1, calculatorPage.subtractionOfNumbers(2,3));

    }
}
