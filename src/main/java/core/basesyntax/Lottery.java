package core.basesyntax;

public class Lottery {
    public static Ball getRandomBall() {
        ColorSupplier.Color[] colors = ColorSupplier.Color.values();

        int rnd1 = (int) (Math.random() * colors.length);
        int rnd2 = (int) (Math.random() * 100);

        return new Ball(colors[rnd1], rnd2);
    }
}
