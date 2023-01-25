package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        int numberOfLottery = 3;
        Lottery lottery = new Lottery();
        for (int i = 0; i < numberOfLottery; i++) {
            System.out.println(lottery.getRandomBall().getColor() + " "
                    + lottery.getRandomBall().getNumber());
        }
    }
}
