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
        //2,3,5,7,21
        Assertions.assertEquals("2",service.fizzBuzz(2));
        Assertions.assertEquals("Fizz",service.fizzBuzz(3));
        Assertions.assertEquals("Buzz",service.fizzBuzz(5));
        Assertions.assertEquals("Whizz",service.fizzBuzz(7));
//        Assertions.assertEquals("FizzBuzz",service.fizzBuzz(15));
        Assertions.assertEquals("FizzBuzz",service.fizzBuzz(60));
        Assertions.assertEquals("FizzWhizz",service.fizzBuzz(21));
//        Assertions.assertEquals("BuzzWhizz",service.fizzBuzz(35));
//        Assertions.assertEquals("FizzBuzzWhizz",service.fizzBuzz(105));
    }

    @Test
    void contain3_test(){
        //13,30
        Assertions.assertEquals("Fizz",service.fizzBuzz(13));
        Assertions.assertEquals("Fizz",service.fizzBuzz(30));
//        Assertions.assertEquals("Fizz",service.fizzBuzz(35));
    }

    @Test
    void contain5_test(){
        //35,15,105
        Assertions.assertEquals("BuzzWhizz",service.fizzBuzz(35));
        Assertions.assertEquals("BuzzWhizz",service.fizzBuzz(15));
        Assertions.assertEquals("BuzzWhizz",service.fizzBuzz(105));
    }

    @Test
    void contain7_test(){
        //75,70,17,107
        Assertions.assertEquals("Flzz",service.fizzBuzz(75));
        Assertions.assertEquals("Flzz",service.fizzBuzz(70));
        Assertions.assertEquals("Flzz",service.fizzBuzz(17));
        Assertions.assertEquals("Flzz",service.fizzBuzz(107));
    }

}
