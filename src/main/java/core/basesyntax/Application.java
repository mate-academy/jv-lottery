package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery ballOne = new Lottery();
        Lottery ballTwo = new Lottery();
        Lottery ballThree = new Lottery();
        Lottery[] ballWin = {ballOne, ballTwo, ballThree};
        for (Lottery ball: ballWin) {
            System.out.println(ball.getRandomBall());
        }
    }
}
