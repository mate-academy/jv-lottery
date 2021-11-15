package core.basesyntax;

import java.util.Random;

public class RandomIndex {
    public static int getRandomIndex(int a) {
        int index = new Random().nextInt(a);
        return index;
    }
}
