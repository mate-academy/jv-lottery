package core.basesyntax;

public class Application extends Lottery {
    public static void main(String[] args) {
        Ball ball1 = getRandomBall();
        Ball ball2 = getRandomBall();
        Ball ball3 = getRandomBall();
        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        System.out.println(ball3.toString());
    }
}
