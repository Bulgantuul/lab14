package labxx.sict.must.edu.mn;

/**
 * Хуваах үйлдлийг гүйцэтгэх класс.
 */
public class Division {
    /**
     * Хоёр тоог хуваана.
     *
     * @param a Хуваагдагч (Dividend)
     * @param b Хуваагч (Divisor)
     * @return Хуваалтын үр дүн
     * @throws IllegalArgumentException Хэрэв хуваагч тэг (0) байвал
     */
    public double divide(final double a, final double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Хуваагч тэг (0) байж болохгүй.");
        }
        return a / b;
    }
}
// Файлын төгсгөлд хоосон мөр үлдээх