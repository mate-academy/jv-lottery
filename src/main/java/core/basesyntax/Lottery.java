package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {

    protected Random random = new Random();
    public String getRandomBall() {
        setColor(getRandomColor());
        setNumber(random.nextInt(100));
        return toString(getColor(),getNumber());
    }
}
