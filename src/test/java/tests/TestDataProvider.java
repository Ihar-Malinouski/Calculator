package tests;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

    public static class TestDataProviderForDivision {
        @DataProvider(name = "valid integer values for division")
        public static Object[][] inputForIntegerValues() {
            return new Object[][]{
                    {12, 4, 3},
                    {12, 3, 4},
                    {120, 60, 2},
                    {250, 2, 125},
                    {3, 1, 3},
                    {44, 11, 4},
                    {1000000, 1000000, 1},
                    {1, 1, 1}
            };
        }
    }

    public static class TestDataProviderForAddition {
        @DataProvider(name = "valid integer values for addition")
        public static Object[][] inputForIntegerValues() {
            return new Object[][]{
                    {1, 1, 2},
                    {2, 2, 4},
                    {123, 3, 126},
                    {111, 32, 143},
                    {45578, 1231234, 1276812},
                    {6456, 23234, 29690},
                    {1222, 3, 1225},
                    {2, 22222, 22224},
                    {222222, 111111, 333333},
                    {888, 112, 1000}
            };
        }
    }

    public static class TestDataProviderForMultiplication {
        @DataProvider(name = "valid integer values for multiplication")
        public static Object[][] inputForIntegerValues() {
            return new Object[][]{
                    {1, 1, 1},
                    {2, 2, 4},
                    {123, 3, 369},
                    {2355, 32, 75360},
                    {12, 33333, 399996},
                    {6456, 11, 71016},
                    {3321, 3, 9963},
                    {2, 11, 22},
                    {332, 111111, 36888852},
                    {12314, 112, 1379168}
            };
        }
    }

    public static class TestDataProviderForSubtractuon {
        @DataProvider(name = "valid integer values for subtractuon")
        public static Object[][] inputForIntegerValues() {
            return new Object[][]{
                    {1, 1, 0},
                    {2, 2, 0},
                    {123, 3, 120},
                    {2355, 32, 2323},
                    {12, 33333, -33321},
                    {6456, 11, 6445},
                    {3321, 3, 3318},
                    {2, 11, -9},
                    {332, 111111, -110779},
                    {12314, 112, 12202}
            };
        }
    }

    public static class InvalidTestDivision{
        @DataProvider(name = "invalid expected result")
        public static Object[][] inputForIntegerValues() {
            return new Object[][]{
                    {4, 2, 1}
            };
        }
    }
}
