package core.basesyntax;


public class Lottery {
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = ColorSupplier.random.nextInt(101);
        return new Ball(randomColor, randomNumber);
    }
}
