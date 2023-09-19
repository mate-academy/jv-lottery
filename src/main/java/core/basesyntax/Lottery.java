package core.basesyntax;

public class Lottery {
    private final ColorSupplier colorSupplier;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = (int) (Math.random() * 100) + 1;
        return new Ball(randomColor, randomNumber);
    }
}
