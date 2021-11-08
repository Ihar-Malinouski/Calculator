package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalculatorPage;

public class SubtractionTest {

    private CalculatorPage calculatorPage = new CalculatorPage();

    @Test
    public void testDiv() throws Exception {
        Assert.assertEquals(4, calculatorPage.divisionOfNumbers(12, 3));

    }
}
