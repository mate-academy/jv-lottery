package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        Lottery ball = new Lottery();

        for (int i = 1; i < 4;i++) {
            System.out.println("Ball #" + i);
            ball.getRandomBall();
        }

    }
}
