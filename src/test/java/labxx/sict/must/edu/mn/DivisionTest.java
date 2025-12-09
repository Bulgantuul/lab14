package labxx.sict.must.edu.mn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class DivisionTest {
    @Test
    void testDividePositive() {
        Division calc = new Division();
        assertEquals(5.0, calc.divide(10.0, 2.0), "10 / 2 нь 5-тай тэнцүү байх ёстой");
    }

    @Test
    void testDivideNegative() {
        Division calc = new Division();
        assertEquals(-5.0, calc.divide(-10.0, 2.0), "-10 / 2 нь -5-тай тэнцүү байх ёстой");
    }

    @Test
    void testDivideByZero() {
        Division calc = new Division();
        
        // assertThrows-ийн үр дүнг exception хувьсагчид оноож, мессежийг шалгах
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10.0, 0.0);
        });
        
        // Exception-ийн мессеж зөв эсэхийг баталгаажуулна
        assertEquals("Хуваагч тэг (0) байж болохгүй.", exception.getMessage());
    }
}
// Файлын төгсгөлд хоосон мөр үлдээх