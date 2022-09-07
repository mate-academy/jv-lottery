package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        Lottery firstBall = new Lottery();
        Lottery secondBall = new Lottery();
        Lottery thirdBall = new Lottery();

        Lottery[] threeBalls = {firstBall, secondBall, thirdBall};
        for (Lottery eachBall : threeBalls) {
            System.out.println(eachBall.getRandomBall());
        }
    }
}
