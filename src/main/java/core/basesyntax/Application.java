package core.basesyntax;

public class Application {
    private static final int VALUE = 3;

    public static void main(String[] args) {
        for (int i = 0; i < VALUE; i++) {
            Lottery ball = new Lottery();
            System.out.println(ball.getRandomBall().toString());
        }
    }
}
