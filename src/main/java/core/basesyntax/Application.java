package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        System.out.println("Enter the color and number of three balls.");
        System.out.println("You can use numbers from 0 to 100 and next colors:\n"
                + "BLUE,\n"
                + "YELLOW,\n"
                + "RED,\n"
                + "GREEN,\n"
                + "WHITE,\n"
                + "BLACK");
        System.out.println("---------------------------------\n");

        System.out.println("Entered results: ");
        Ball firstBall = new Ball();
        firstBall.setColour("GREEN");
        firstBall.setNumber(54);
        System.out.println(firstBall);

        Ball secondBall = new Ball();
        secondBall.setColour("RED");
        secondBall.setNumber(81);
        System.out.println(secondBall);

        Ball thirdBall = new Ball();
        thirdBall.setColour("BLUE");
        thirdBall.setNumber(4);
        System.out.println(thirdBall + "\n");
        System.out.println("---------------------------------\n");

        System.out.println("Lottery results: ");
        ColorSupplier[] balls = new Lottery[NUMBER_OF_BALLS];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = new Lottery();
            System.out.println(balls[i].getRandomBall());
        }
    }
}
