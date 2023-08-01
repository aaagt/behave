package aaagt.behave.iterator;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    private final Random random = new Random();
    private final int minInteger;
    private final int maxInteger;

    public Randoms(int minInteger, int maxInteger) {
        this.minInteger = minInteger;
        this.maxInteger = maxInteger;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(minInteger, maxInteger + 1);
            }
        };
    }
}
