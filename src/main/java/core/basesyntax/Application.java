package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        int count = 3;
        while (count != 0) {
            System.out.println(lottery.getRandomBall());
            --count;
        }
    }
}
