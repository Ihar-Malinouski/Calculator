package tests;

import  org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalculatorPage;

public class MultiplicationTest {

    private CalculatorPage calculatorPage = new CalculatorPage();

    @Test
    public void testDiv() throws Exception {
        Assert.assertEquals(12, calculatorPage.multiplicationOfNumbers(4,3));

    }
}
