package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        Color[] colors = Color.values();
        String randomColor = colors[random.nextInt(colors.length)].name();
        int randomNumber = random.nextInt(100) + 1;
        return new Ball(randomColor, randomNumber);

    }
}
