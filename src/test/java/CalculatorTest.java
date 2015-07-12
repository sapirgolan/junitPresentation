import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

    private Calculator classUnderTest;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testSummingUp() throws Exception {
        Calculator calculator = new Calculator();
        int sum = calculator.summingUp("1+2+3");
        Assert.assertEquals(6, sum);
    }

    @Ignore("classUnderTest is not initialized yet")
    @Test
    public void testSubtraction() throws Exception {
        int sum = classUnderTest.summingUp("1-2-3");
        Assert.assertEquals(-4, sum);

    }
}