package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] ballArray = new Ball[] {
                lottery.getRandomBall(),
                lottery.getRandomBall(),
                lottery.getRandomBall()};

        for (Ball currentBall : ballArray) {
            System.out.println(currentBall.toString());
        }
    }
}
