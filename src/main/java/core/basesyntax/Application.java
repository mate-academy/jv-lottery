package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Lottery lottery = new Lottery(0,"" + colorSupplier.getRandomColor());
        Lottery lottery1 = new Lottery(0,"" + colorSupplier.getRandomColor());
        Lottery lottery2 = new Lottery(0,"" + colorSupplier.getRandomColor());

        System.out.println(lottery.getRandomBall());
        System.out.println(lottery1.getRandomBall());
        System.out.println(lottery2.getRandomBall());
    }
}
