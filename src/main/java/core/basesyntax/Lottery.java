package core.basesyntax;

import java.util.Random;

public class Lottery {
    private String nameColorGenerate = "";
    private int magicNumber = 100;
    private int resultGetRandom = 0;

    public Ball getRandomBall() {
        ColorSupplier randColor = new ColorSupplier();
        nameColorGenerate = randColor.getRandomColor().toString();
        Random random = new Random();
        resultGetRandom = random.nextInt(magicNumber);
        return new Ball(nameColorGenerate, resultGetRandom);
    }
}
