import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FizzBuzzServiceTest {

    private static FizzBuzzService service;


    @BeforeAll
    static void init(){
        service = new FizzBuzzService();
    }



    @Test
    void multiply_test(){
        //2,3,5,7,15,21,35,105
        Assertions.assertEquals("2",service.fizzBuzz(2));
        Assertions.assertEquals("Fizz",service.fizzBuzz(3));
        Assertions.assertEquals("Buzz",service.fizzBuzz(5));
        Assertions.assertEquals("Whizz",service.fizzBuzz(7));
        Assertions.assertEquals("FizzBuzz",service.fizzBuzz(15));
        Assertions.assertEquals("FizzWhizz",service.fizzBuzz(21));
        Assertions.assertEquals("BuzzWhizz",service.fizzBuzz(35));
        Assertions.assertEquals("FizzBuzzWhizz",service.fizzBuzz(105));
    }

}
