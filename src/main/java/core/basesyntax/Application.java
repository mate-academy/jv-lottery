package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery ball1 = new Ball();
        Lottery ball2 = new Ball();
        Lottery ball3 = new Ball();

        Lottery[] ball = {ball1, ball2, ball3};
        for (Lottery balls : ball) {
            System.out.println(balls.getRandomBall());
        }
    }
}
