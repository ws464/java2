import java.util.ArrayList;
public class Calculator {
    private ArrayList<String> history;
    public Calculator(){
        history = new ArrayList<String>();
    }
    Integer add(Integer number1, Integer number2){
        int result = number1+number2;
        history.add(String.format("%d + %d = %d", number1, number2, result));
        return (Integer)result;
    }
    Integer subtract(Integer number1, Integer number2){
        int result = number1-number2;
        history.add(String.format("%d - %d = %d", number1, number2, result));
        return (Integer)result;
    }
    Integer multiply(Integer number1, Integer number2){
        int result = number1*number2;
        history.add(String.format("%d * %d = %d", number1, number2, result));
        return (Integer)result;
    }
    Integer divide(Integer number1, Integer number2){
        int result = number1/number2;
        history.add(String.format("%d / %d = %d", number1, number2, result));
        return (Integer)result;
    }

    String getHistory(){
        return history.toString();
    }
}
