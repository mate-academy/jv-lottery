package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery [] lot = new Lottery[3];
        for (int i = 0; i < lot.length; i++) {
            lot[i] = new Lottery();
            System.out.println(lot[i].getRandomBall());
        }
    }
}
