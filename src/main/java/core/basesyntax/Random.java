package core.basesyntax;

public class Random {
    private static final int MAXIMUM_NUMBER = 100;

    public static int getRandomNumber() {
        return new java.util.Random().nextInt(MAXIMUM_NUMBER);
    }

    public static int getRandomColorIndex() {
        return new java.util.Random().nextInt(Color.values().length);
    }
}
