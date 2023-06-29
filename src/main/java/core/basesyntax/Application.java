package core.basesyntax;

public class Application {
    private static final int NUMBERS_OF_LOTTERY = 3;
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery[] lottery = new Lottery[NUMBERS_OF_LOTTERY];
        for (int i = 0; i < 3; i++){
            lottery[i] = new Lottery();
            System.out.println(lottery[i].getRandomBall());
        }
    }
}
