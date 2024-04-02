import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

public class EvenOddTester {
    @Test
    public void IfEven(){
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        assertTrue(evenOddNumber.evenOrOdd(12));
    }
    @Test
    public void IfOdd(){
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        assertFalse(evenOddNumber.evenOrOdd(11));
    }

}
