package core.basesyntax;

public class Lottery {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(COLOR_SUPPLIER.getRandomColor(),
                getRandomNumberFromRange(MIN_NUMBER, MAX_NUMBER));
    }

    public int getRandomNumberFromRange(int firstInteger, int secondInteger) {
        int startRange = Math.min(firstInteger, secondInteger);
        int endRange = Math.max(firstInteger, secondInteger);
        return (int) (Math.random() * (endRange - startRange + 1) + startRange);
    }
}
