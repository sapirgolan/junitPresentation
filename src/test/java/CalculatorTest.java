import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

    private Calculator classUnderTest;

    @Before
    public void setUp() throws Exception {
        classUnderTest = new Calculator();
    }

    @Test
    public void testSummingUp() throws Exception {
        int sum = classUnderTest.summingUp("1+2+3");
        Assert.assertEquals(6, sum);
    }

    @Test
    public void testSubtraction() throws Exception {
        int sum = classUnderTest.summingUp("1-2-3");
        Assert.assertEquals(-4, sum);
    }

    @Ignore("Division by zero exception")
    @Test
    public void testDivision() throws Exception {
        double division = classUnderTest.division("9:3:1:0");
        Assert.assertEquals(3.0, division, 0.00001);
    }
}