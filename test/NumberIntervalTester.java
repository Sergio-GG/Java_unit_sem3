import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberIntervalTester {
    static NumberInInterval numberInInterval;

    @BeforeAll
    public static void setUp() {
        numberInInterval = new NumberInInterval();
    }
    @Test
    public void ifOnLowEdge(){
        assertFalse(numberInInterval.isNumberInInterval(25));
    }
    @Test
    public void ifOnHighEdge(){
        assertFalse(numberInInterval.isNumberInInterval(100));
    }
    @Test
    public void ifInRange(){
        assertTrue(numberInInterval.isNumberInInterval(50));
    }
}
