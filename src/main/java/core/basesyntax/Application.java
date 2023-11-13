package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery randomBall = new Lottery();
        for (int i = 1; i < 4; i++) {
            System.out.println("Random Ball " + i + ":" + " "
                    + randomBall.getRandomBall().getNumber() + " "
                    + randomBall.getRandomBall().getColor());
        }
    }
}
