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

    public double division(String expression) {
        double result = 0;
        boolean firstElementExists = false;
        for (String summand: expression.split("\\:")) {
            Double aDouble = Double.valueOf(summand);
            if (firstElementExists) {
                if ( aDouble == 0){
                    throw new IllegalArgumentException("Cannot divide by Zero");
                }
                result /= aDouble;
            } else {
                result = aDouble;
                firstElementExists = true;
            }
        }
        return result;
    }
}
