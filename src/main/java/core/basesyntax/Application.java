package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery ballOfLottery = new Lottery();
        // create three balls using class Lottery and print information about them in console
        System.out.println(ballOfLottery.getRandomBall());
        System.out.println(ballOfLottery.getRandomBall());
        System.out.println(ballOfLottery.getRandomBall());
    }
}
