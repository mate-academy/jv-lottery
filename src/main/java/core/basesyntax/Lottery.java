package core.basesyntax;

public class Lottery {
    public static Ball getRandomBall() {
        int randomNumber = NumberSupplier.getRandomNumber();
        String randomColor = ColorSupplier.getRandomColor();
        return new Ball(randomNumber, randomColor);
    }
}
