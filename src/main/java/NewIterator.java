import java.util.Iterator;
import java.util.Random;

public class NewIterator implements Iterator<Integer> {
    int min;
    int max;
    Random random;

    public NewIterator(int min, int max, Random random) {
        this.min = min;
        this.max = max;
        this.random = random;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int diff = max - min;
        return min + random.nextInt(diff + 1);
    }

}
