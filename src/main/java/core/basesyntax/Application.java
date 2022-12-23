package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Lottery lottery = new Lottery("" + colorSupplier.getRandomColor(), 0);
        Lottery lottery1 = new Lottery("" + colorSupplier.getRandomColor(), 0);
        Lottery lottery2 = new Lottery("" + colorSupplier.getRandomColor(), 0);

        System.out.println(lottery.getRandomBall());
        System.out.println(lottery1.getRandomBall());
        System.out.println(lottery2.getRandomBall());
    }
}
