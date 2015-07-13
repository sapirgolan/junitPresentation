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
        int subtract = 0;
        boolean firstElementExists = false;

        for (String digit: expression.split("\\-")) {
            Integer number = Integer.valueOf(digit);
            if (firstElementExists) {
                subtract -= number;
            } else {
                subtract = number;
                firstElementExists = true;
            }
        }
        return subtract;
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

    public int operation(String expression) {
        StringBuilder builder = new StringBuilder();
        for (String ex : expression.split("\\;")) {
            int summingUp = this.summingUp(ex);
            builder.append(summingUp);
            builder.append("+");
        }
        builder.deleteCharAt(builder.length() - 1);
        return this.summingUp(builder.toString());
    }
}
