package core.basesyntax;

public class Lottery {

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final NumberSupplier numberSupplier = new NumberSupplier();

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = numberSupplier.getRandomNumber();

        return new Ball(randomColor, randomNumber);
    }
}
