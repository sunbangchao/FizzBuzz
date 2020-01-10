import javafx.beans.binding.When;

public class FizzBuzzService {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public String fizzBuzz(int index){
        StringBuffer result = new StringBuffer("");
        if(contain3(index) && !contain5(index)){
            result.append(FIZZ);
        }else {
            if (multiply3(index) && (!contain5(index) || contain7(index))) result.append(FIZZ);
            if (multiply5(index) && !contain7(index)) result.append(BUZZ);
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

    private boolean contain3(int index){
        while (index > 0){
            int num = index % 10;
            if (num == 3) return true;
            index = index / 10;
        }
        return false;
    }

    private boolean contain5(int index){
        while (index > 0){
            int num = index % 10;
            if (num == 5) return true;
            index = index / 10;
        }
        return false;
    }

    private boolean contain7(int index){
        while (index > 0){
            int num = index % 10;
            if (num == 7) return true;
            index = index / 10;
        }
        return false;
    }
}
