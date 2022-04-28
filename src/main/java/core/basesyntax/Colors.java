package core.basesyntax;

import java.util.Random;
import java.util.List;

public enum Colors {
    RED,
    GREEN,
    BLUE,
    BLACK,
    WHITE,
    YELLOW,
    ORANGE;

    //Down here is what I found on Stackoverflow. This code was used by me to optimise memory usage.
    private static final List<Colors> VALUES = List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Colors randomColor()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
