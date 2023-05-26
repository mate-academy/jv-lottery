package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery ball = new Lottery();
        System.out.println(ball.getRandomBall());
    }
}
