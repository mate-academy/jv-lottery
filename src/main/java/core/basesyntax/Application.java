package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] allBalls = new Ball[3];
        Lottery lottery = new Lottery();
        for (int i = 0; i < allBalls.length; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}

