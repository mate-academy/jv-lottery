package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery[] lotteryArray = {new Lottery(), new Lottery(), new Lottery()};
        for (Lottery numberOfArray : lotteryArray) {
            System.out.println(numberOfArray.getRandomBall());
        }
    }
}
