package armazenarnumber.example.numbersSAVE;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {
    private NumberService numberService;

    @BeforeEach
    public void setup() {
        numberService = new NumberService(); // Instantiate your NumberService here
    }

    @Test
    public void testProcessarValidNumbers() {
        List<Integer> validNumbers = Arrays.asList(2, 4, 6);

        ResponseEntity<?> response = numberService.processar(validNumbers);

        assertNotNull(response);
        assertEquals(HttpStatus.OK, response.getStatusCode());

        Number number = (Number) response.getBody();
        assertEquals(3, number.getNumDadosRecebidos());
        assertEquals(4.0, number.getMedia(), 0.001); // Using delta for double comparison due to floating-point precision
    }

    @Test
    public void testProcessarTooManyNumbers() {
        List<Integer> tooManyNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21);

        try {
            numberService.processar(tooManyNumbers);
            fail("Expected ResponseStatusException to be thrown");
        } catch (ResponseStatusException e) {
            assertEquals(HttpStatus.BAD_REQUEST, e.getStatusCode()); // Use the constructor argument to check the status
        }
    }
}