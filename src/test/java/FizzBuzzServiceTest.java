import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FizzBuzzServiceTest {

    private static FizzBuzzService service;


    @BeforeAll
    static void init(){
        service = new FizzBuzzService();
    }
    

}
