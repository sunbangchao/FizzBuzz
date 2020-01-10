public class FizzBuzzService {

    public String fizzBuzz(int index){
        StringBuffer result = new StringBuffer("");
        if(contain7(index)){
            result.append("Flzz");
        }else if(contain5(index)){
            result.append("BuzzWhizz");
        }else if(contain3(index)){
            result.append("Fizz");
        }else {
            if (multiply3(index)) result.append("Fizz");
            if (multiply5(index)) result.append("Buzz");
            if (multiply7(index)) result.append("Whizz");
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
