package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] setOfBalls = new Ball[3];

        for (int i = 0; i < 3; i++) {
            setOfBalls[i] = lottery.getRandomBall();
            System.out.println(setOfBalls[i].toString());
        }
    }
}
