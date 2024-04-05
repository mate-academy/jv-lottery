package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery createBall = new Lottery();

        Ball ball1 = createBall.getRandomBall();
        Ball ball2 = createBall.getRandomBall();
        Ball ball3 = createBall.getRandomBall();

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
