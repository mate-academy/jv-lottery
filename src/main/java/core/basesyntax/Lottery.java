package core.basesyntax;

import core.basesyntax.ball.Ball;
import core.basesyntax.ball.Color;
import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        int indexColor = new Random().nextInt(Color.values().length);
        Color color = Color.values()[indexColor];
        int number = new Random().nextInt(100);
        return new Ball(color, number).toString();
    }

}
