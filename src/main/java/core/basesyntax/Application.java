package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        final int ballCounter = 3;
        Lottery ball = new Lottery();
        for (int i = 0; i < ballCounter; i++) {
            System.out.println(ball.getRandomBall());
        }
    }
}
