package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] ballsArray = new Ball[3];
        Lottery lottery = new Lottery();
        for (int i = 0; i < ballsArray.length; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
