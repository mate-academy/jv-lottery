package core.basesyntax;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier;
    private Random magicNumbers ;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
        this.magicNumbers = new Random();
    }


    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor().name();
        int number = magicNumbers.nextInt(100)+1;
        return new Ball(color, number);
    }
}
