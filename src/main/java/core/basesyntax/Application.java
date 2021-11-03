package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball ball = new Lottery().getRandomBall();
        Ball ball1 = new Lottery().getRandomBall();
        Ball ball2 = new Lottery().getRandomBall();
        Ball[] bollArray = new Ball[] {ball, ball1, ball2};
        for (Ball bollForEach : bollArray) {
            System.out.println(bollForEach);
        }
    }
}
