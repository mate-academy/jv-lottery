package core.basesyntax;

public class Lottery {
    private static final ColorSupplier colorsSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String randomColor = colorsSupplier.getRandomColor();
        int randomNumber = colorsSupplier.getRandom().nextInt(100);
        return new Ball(randomColor, randomNumber);
    }
}
