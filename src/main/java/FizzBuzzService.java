public class FizzBuzzService {

    public String fizzBuzz(int index){
        StringBuffer result = new StringBuffer("");
        if(multiply3(index)) result.append("Fizz");
        if(multiply5(index)) result.append("Buzz");
        if(multiply7(index)) result.append("Whizz");
        if(result.length() == 0) result.append(index);
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
}
