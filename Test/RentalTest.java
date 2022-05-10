import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RentalTest {
    private Rental rental;
    private Movie movie;

    @BeforeAll
    public void setUp() {
        movie = new Movie("Movie Title", 0);
        rental = new Rental(movie, 10);
    }

    @Test
    public void getDaysRented() {
        assertEquals(10, rental.getDaysRented());
    }

    @Test
    public void getMovie() {
        assertEquals(movie, rental.getMovie());
    }
}
