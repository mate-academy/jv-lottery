package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        ColorSupplier supplier = new ColorSupplier();
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(supplier.getRandomColor());
        }
    }
}
