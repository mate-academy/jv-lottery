package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery ball1 = new Lottery();
        Lottery ball2 = new Lottery();
        Lottery ball3 = new Lottery();
        Lottery[] balls = {ball1, ball2, ball3};
        for (Lottery ball : balls) {
            System.out.println(ball.getRandomBall());
        }
    }
}
