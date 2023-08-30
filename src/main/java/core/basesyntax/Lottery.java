package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        int number = random.nextInt(100);
        int index = new Random().nextInt(Color.values().length);
        Color color = Color.values()[index];
        return new Ball(number, color.name());
    }

}
