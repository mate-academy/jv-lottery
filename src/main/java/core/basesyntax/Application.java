package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        Lottery lottery = new Lottery();
        int numberOfBallFalls = 1;
        do {
            System.out.println(lottery.getRandomBall());
            numberOfBallFalls++;
        } while (numberOfBallFalls <= 3);
    }
}
