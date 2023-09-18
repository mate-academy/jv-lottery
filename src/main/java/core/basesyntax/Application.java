package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery[] lottery = {new Lottery(), new Lottery(), new Lottery()};

        for(int i = 0; i < lottery.length; i++) {
            System.out.println(lottery[i].getRandomBall());
            System.out.println();
        }
    }
}
