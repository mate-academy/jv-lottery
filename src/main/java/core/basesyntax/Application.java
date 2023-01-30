package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lt = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println(lt.getRandomBall());
        }// create three balls using class Lottery and print information about them in console
    }
}
