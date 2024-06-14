package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery game = new Lottery();

        Ball ball1 = game.getRandomBall();
        Ball ball2 = game.getRandomBall();
        Ball ball3 = game.getRandomBall();

        System.out.println(ball1
                + "\n"
                + ball2
                + "\n"
                + ball3);
    }
}
