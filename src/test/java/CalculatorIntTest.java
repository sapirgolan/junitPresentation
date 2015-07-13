import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorIntTest {

    private Calculator clasUnderTest;

    @Before
    public void setUp() throws Exception {
        this.clasUnderTest = new Calculator();
    }

    @Test
    public void testOperation() throws Exception {
        int sum = clasUnderTest.operation("1+2+3;11+12+13;1+3+4");
        Assert.assertEquals(50, sum);
    }
}