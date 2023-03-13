import org.jetbrains.annotations.NotNull;
import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int min;
    int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new NewIterator(min, max, random);
    }
}
