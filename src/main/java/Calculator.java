/**
 * Created by I062070 on 12/07/2015.
 */
public class Calculator {

    public int summingUp(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }

    public int subtraction(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum -= Integer.valueOf(summand);
        return sum;
    }
}
