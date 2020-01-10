import javafx.beans.binding.When;

public class FizzBuzzService {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String fizzBuzz(int index){
        StringBuffer result = new StringBuffer("");
        if(containNumber(index,3) && !containNumber(index,5)){
            result.append(FIZZ);
        }else {
            if (multiplyByNumber(index,3) && (!containNumber(index,5) || containNumber(index,7))) result.append(FIZZ);
            if (multiplyByNumber(index,5) && !containNumber(index,7)) result.append(BUZZ);
            if (multiplyByNumber(index,7)) result.append(WHIZZ);
            if (result.length() == 0) result.append(index);
        }
        return result.toString();
    }

    private boolean multiplyByNumber(int number1, int number2){
        if(number2 == 0) return number1 == 0;
        if(number1 % number2 == 0) return true;
        return false;
    }

    private boolean containNumber(int number1,int number2){
        while(number1 > 0){
            int num = number1 % 10;
            if(num == number2) return true;
            number1 = number1 / 10;
        }
        return false;
    }
}
