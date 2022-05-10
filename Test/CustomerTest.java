import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CustomerTest {
    @Test
    public void getNameTest() {
        var customer = new Customer("Sarah");
        Assertions.assertEquals("Sarah", customer.getName());
    }

}
