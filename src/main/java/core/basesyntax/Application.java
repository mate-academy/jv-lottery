package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        colorSupplier.getRandomColor();
        Lottery [] lotteries = new Lottery[3];
        for (int i = 0; i < lotteries.length; i++) {
            lotteries[i] = new Lottery();
            System.out.println(lotteries[i].getRandomBall());
        }
    }
}
