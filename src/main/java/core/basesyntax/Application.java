package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] allBalls = new Ball[3];
        for (int i = 0; i < allBalls.length; i++) {
            Lottery lottery = new Lottery();
            System.out.println(lottery.getRandomBall());
        }
    }
}

