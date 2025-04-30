package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery firstLottery = new Lottery();
        Lottery secondLottery = new Lottery();
        Lottery thirdLottery = new Lottery();

        System.out.println(firstLottery.getRandomBall().toString());
        System.out.println(secondLottery.getRandomBall().toString());
        System.out.println(thirdLottery.getRandomBall().toString());
    }
}
