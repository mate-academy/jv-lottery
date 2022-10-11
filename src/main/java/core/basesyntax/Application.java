package core.basesyntax;

public class Application {
    static final String BALL = "Ball1";
    static final String BALL2 = "Ball2";
    static final String BALL3 = "Ball3";
    static final String[] FINAL_NUMBER = {BALL, BALL2, BALL3};

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < FINAL_NUMBER.length; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
