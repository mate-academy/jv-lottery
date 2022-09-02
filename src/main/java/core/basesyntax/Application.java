package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lotter = new Lottery();
        Ball[] balls = {lotter.getRandomBall(),lotter.getRandomBall(),lotter.getRandomBall()};
        for (Ball ball: balls) {
            System.out.println(ball);
        }
    }
}
