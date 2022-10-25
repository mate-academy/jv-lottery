package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        ColorSupplier color = new ColorSupplier();

        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ball number " + lottery.getRandomBall());
            System.out.println(color.getRandomColor());
        }
    }
}
