package labxx.sict.must.edu.mn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdditionTest {
    @Test
    void testAddPositiveNumbers() {
        Addition calc = new Addition();
        assertEquals(5.0, calc.add(2.0, 3.0), "2 + 3 нь 5-тай тэнцүү байх ёстой");
    }

    @Test
    void testAddNegativeNumbers() {
        Addition calc = new Addition();
        assertEquals(-5.0, calc.add(-2.0, -3.0), "-2 + -3 нь -5-тай тэнцүү байх ёстой");
    }

    @Test
    void testAddMixedNumbers() {
        Addition calc = new Addition();
        assertEquals(1.0, calc.add(-2.0, 3.0), "-2 + 3 нь 1-тэй тэнцүү байх ёстой");
    }
}
