package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final Random random = new Random();

    public Ball getRandomBall() {
        ColourSuplier colourSuplier = new ColourSuplier();
        Colours randomColor = colourSuplier.getRandomColour();
        int randomNumber = random.nextInt(101);
        return new Ball(randomColor.name().toLowerCase(), randomNumber);

    }
}
