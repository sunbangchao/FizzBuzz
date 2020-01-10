import javafx.beans.binding.When;

public class FizzBuzzService {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public String fizzBuzz(int index){
        StringBuffer result = new StringBuffer("");
        if(containNumber(index,3) && !containNumber(index,5)){
            result.append(FIZZ);
        }else {
            if (multiply3(index) && (!containNumber(index,5) || containNumber(index,7))) result.append(FIZZ);
            if (multiply5(index) && !containNumber(index,7)) result.append(BUZZ);
            if (multiply7(index)) result.append(WHIZZ);
            if (result.length() == 0) result.append(index);
        }
        return result.toString();
    }

    private boolean multiply3(int index){
        if(index % 3 == 0) return true;
        return false;
    }

    private boolean multiply5(int index){
        if(index % 5 == 0) return true;
        return false;
    }

    private boolean multiply7(int index){
        if(index % 7 == 0) return true;
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
