package labxx.sict.must.edu.mn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SubtractionTest {
    /**
     * Эерэг тоо хасах үйлдлийг шалгах тест.
     */
    @Test
    void testSubtractPositive() {
        Subtraction calc = new Subtraction();
        assertEquals(1.0, calc.subtract(3.0, 2.0), "3 - 2 нь 1-тэй тэнцүү байх ёстой");
    }

    /**
     * Сөрөг тоог хасах (нэмэх) үйлдлийг шалгах тест.
     */
    @Test
    void testSubtractNegative() {
        Subtraction calc = new Subtraction();
        assertEquals(5.0, calc.subtract(2.0, -3.0), "2 - (-3) нь 5-тай тэнцүү байх ёстой");
    }
}
// Файлын төгсгөлд хоосон мөр заавал үлдээх