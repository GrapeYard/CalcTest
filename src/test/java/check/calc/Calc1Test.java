package check.calc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import the.best.calc.Calc1;

public class Calc1Test {
    private Calc1 trueResultAfterOperationTest;

    @Before
    public void setUp() {
        trueResultAfterOperationTest = new Calc1();
    }

    @Test
    public void testPlus() {
        int x = 34;
        int y = 16;
        int expectedResult = 50;
        long result = trueResultAfterOperationTest.plus(x, y);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testMinus() {
        int x = 70;
        int y = 55;
        int expectedResult = 15;
        long result = trueResultAfterOperationTest.minus(x, y);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiply() {
        int x = 15;
        int y = 4;
        long expectedResult = 60;
        long result = trueResultAfterOperationTest.multiply(x, y);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testDivide() {
        int x = 120;
        int y = 6;
        double expectedResult = 20;
        double result = trueResultAfterOperationTest.divide(x, y);
        Assert.assertEquals(expectedResult, result,0.000001);
    }
}
