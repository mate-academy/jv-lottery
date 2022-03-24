package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
      ColorSupplier test1 = new ColorSupplier();
        System.out.println(test1.getRandomColor());
        Lottery ball = new Lottery();
        for(int i = 0; i < NUMBER_OF_BALLS; i++) {
            System.out.println(ball.getRandomBall());
        }
    }
}
