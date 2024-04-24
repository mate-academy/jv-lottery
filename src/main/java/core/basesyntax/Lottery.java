package core.basesyntax;

public class Lottery {

    private static ColorSupplier colorSupplier = new ColorSupplier();

    public static Ball getRandomBall() {

       Colors color = colorSupplier.getRandomColor();
        int number = Random.getRandom().nextInt(101);

        return new Ball(color, number);
    }
}
