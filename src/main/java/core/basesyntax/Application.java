package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        Lottery ball = new Ball();
        System.out.println(ball.getRandomBall().toString());
        System.out.println(ball.getRandomBall().toString());
        System.out.println(ball.getRandomBall().toString());
    }
}
