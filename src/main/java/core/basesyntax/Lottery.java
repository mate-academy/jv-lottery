package core.basesyntax;

public class Lottery {
    public static Colors getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Colors randomColor = colorSupplier.getRandomColor();
        return randomColor;

    }
}


