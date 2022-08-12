package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        Ball[] ball = new Ball[3];

        for (int i = 1; i <= 3; i++) {

            ball[i - 1] = new Lottery().getRandomBall();
            System.out.println("Ball #" + i + " was created in " + ball[i - 1].getColor()
                    + " color with number of " + ball[i - 1].getNumber());
        }

    }
}
