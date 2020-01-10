public class GameStart {

    private static FizzBuzzService service = new FizzBuzzService();

    public static void main(String[] args){
        for( int i = 0; i < 120; i++) {
            String result = service.fizzBuzz(i+1);
            System.out.println(result);
        }
    }
}
