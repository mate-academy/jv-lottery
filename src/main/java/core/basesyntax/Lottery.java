package core.basesyntax;

public class Lottery {

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {

        Colors color = colorSupplier.getRandomColor();
        int number = (int) (Math.random() * 100) + 1;

        return new Ball(color, number);
    }
}
