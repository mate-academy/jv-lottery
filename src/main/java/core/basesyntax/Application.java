package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery l1 = new Lottery();
        for (int i = 0; i < 3; i++) {
            String str = l1.getRandomBall().toString();
            System.out.println(str);
        }
    }
}
